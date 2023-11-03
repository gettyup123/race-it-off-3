document.addEventListener('touchmove', (event) => {
  const touchX = event.touches[0].clientX;
  carPosition = touchX - container.offsetLeft - car.clientWidth / 2;
  carPosition = Math.max(0, Math.min(container.clientWidth - car.clientWidth, carPosition));
  car.style.left = carPosition + 'px';
});
  } else if (event.key === 'A') {
        isInvincible = true;
      } else if (event.key === 'F') {
        isInvincible = false;
      }
    });
