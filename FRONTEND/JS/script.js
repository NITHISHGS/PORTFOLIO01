document.addEventListener("DOMContentLoaded", () => {
    // 1. Setup the Intersection Observer
    const observerOptions = {
        root: null, // Use the viewport
        threshold: 0.1 // Trigger when 10% of the element is visible
    };

    const observer = new IntersectionObserver((entries, observer) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                const element = entry.target;
                
                // Remove the hidden class and add the animation class
                element.classList.remove('scroll-hidden');
                element.classList.add('fade-in-section');
                
                // Stop observing this element (animate only once)
                observer.unobserve(element);
            }
        });
    }, observerOptions);

    // 2. Select elements to animate
    // Automatically targeting all <section> tags and any element with .scroll-hidden
    const elementsToAnimate = document.querySelectorAll('section, .scroll-hidden');
    
    elementsToAnimate.forEach(el => {
        el.classList.add('scroll-hidden'); // Ensure they are hidden before animation
        observer.observe(el);
    });
});