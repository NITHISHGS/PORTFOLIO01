document.addEventListener('DOMContentLoaded', () => {
    const certificateItems = document.getElementById('certificate-items');
    const certificates = [
        { title: "Full Stack Web Development", issuer: "Coursera", date: "June 2023" },
        { title: "Data Science Professional", issuer: "edX", date: "December 2022" },
        { title: "Cybersecurity Basics", issuer: "Udemy", date: "March 2024" }
    ];
    certificates.forEach(cert => {
        const certCard = document.createElement('div');
        certCard.className = 'certificate-card';
        certCard.innerHTML = `
            <h3>${cert.title}</h3>
            <p>Issued by: ${cert.issuer}</p>
            <p>Date: ${cert.date}</p>
        `;
        certificateItems.appendChild(certCard);
    }
    );
});

