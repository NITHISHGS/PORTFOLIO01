const card = document.getElementById("card");

// It's best practice to ensure the element exists before adding listeners.
if (card) {
  let rotateX = 0;
  let rotateY = 0;
  let scale = 1;
  let transition = "none";

  // A single function to apply all transformations prevents conflicts.
  function applyTransform() {
    card.style.transition = transition;
    card.style.transform = `rotateY(${rotateY}deg) rotateX(${rotateX}deg) scale(${scale})`;
  }

  document.addEventListener("mousemove", e => {
    transition = "none"; // Rotation should be immediate while moving the mouse.
    rotateY = (window.innerWidth / 2 - e.pageX) / 25;
    // Inverting the Y-axis rotation provides a more natural feel.
    rotateX = (e.pageY - window.innerHeight / 2) / 25;
    applyTransform();
  });

  // Smoothly reset the card's position when the mouse leaves the window.
  document.addEventListener("mouseleave", () => {
    transition = "transform 0.5s ease";
    rotateX = 0;
    rotateY = 0;
    scale = 1;
    applyTransform();
  });

  card.addEventListener("mouseenter", () => {
    transition = "transform 0.2s ease";
    scale = 1.05;
    applyTransform();
  });

    card.addEventListener("mouseout", () => {
    transition = "transform 0.2s ease";
    scale = 1;
    applyTransform();
  });
}
