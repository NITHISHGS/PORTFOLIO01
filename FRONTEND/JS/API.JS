const API_URL = "http://www.NITHISHPORTFOLIO.COM";
// Generic fetch function
async function fetchData(endpoint) {
    try {
        const response = await fetch(`${API_URL}/${endpoint}`);
        if (!response.ok) {
            throw new Error(`HTTP error! Status: ${response.status}`);
        }
        return await response.json();
    } catch (error) {
        console.error(`Error fetching ${endpoint}:`, error);
        return null;
    }
}

// Load Profile for INDEX.HTML
async function loadProfile() {
    const container = document.querySelector('.profile-container');
    if (!container) return;

    const profiles = await fetchData('profile');
    if (profiles && profiles.length > 0) {
        const profile = profiles[0];
        container.innerHTML = `
            <img src="${profile.imageUrl}" alt="Profile Picture" class="profile-pic">
            <h1>${profile.name}</h1>
            <p>${profile.bio}</p>
        `;
    }
}

// Load Skills for SKILLS.HTML
async function loadSkills() {
    const container = document.querySelector('.skills-container');
    if (!container) return;

    const skills = await fetchData('skills');
    if (skills && skills.length > 0) {
        container.innerHTML = ''; // Clear hardcoded content
        skills.forEach(skill => {
            const card = document.createElement('div');
            card.className = 'skill-card';
            card.innerHTML = `
                <h3>${skill.name}</h3>
                <p>${skill.description || skill.proficiency}</p>
                <a href="#" class="btn">Get Course</a>
            `;
            container.appendChild(card);
        });
    }
}

// Load Skills for RESUME.HTML
async function loadResumeSkills() {
    const list = document.querySelector('.skills-list');
    if (!list) return;

    const skills = await fetchData('skills');
    if (skills && skills.length > 0) {
        list.innerHTML = ''; // Clear hardcoded content
        skills.forEach(skill => {
            const li = document.createElement('li');
            li.textContent = skill.name;
            list.appendChild(li);
        });
    }
}

// Handle Contact Form Submission
function setupContactForm() {
    const form = document.querySelector('form');
    if (!form) return;

    form.addEventListener('submit', (event) => {
        event.preventDefault();
        
        const formData = new FormData(form);
        
        // Collect form data for the email body
        let body = "";
        for (const [key, value] of formData.entries()) {
            body += `${key.toUpperCase()}: ${value}\n`;
        }

        // Open default mail client with the message
        window.location.href = `mailto:nithishgs05@gmail.com?subject=Portfolio Contact Form&body=${encodeURIComponent(body)}`;
        
        form.reset();
    });
}

// Initialize
document.addEventListener('DOMContentLoaded', () => {
    loadProfile();
    loadSkills();
    loadResumeSkills();
    setupContactForm();
});