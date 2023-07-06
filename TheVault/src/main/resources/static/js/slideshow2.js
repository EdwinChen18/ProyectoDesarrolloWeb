let slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
    showSlides(slideIndex += n);
}

function currentSlide(n) {
    showSlides(slideIndex = n);
}

function showSlides(n) {
    let i;
    let slides = document.getElementsByClassName("mySlides");
    let dots = document.getElementsByClassName("dot");
    if (n > slides.length) {
        slideIndex = 1;
    }
    if (n < 1) {
        slideIndex = slides.length;
    }
    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex - 1].style.display = "block";
    dots[slideIndex - 1].className += " active";

    // Reiniciar el slider después de mostrar la última diapositiva
    if (slideIndex === slides.length) {
        setTimeout(function () {
            slideIndex = 0;
            showSlides(slideIndex + 1);
        }, 2000); // Espera 2 segundos antes de reiniciar
    } else {
        setTimeout(function () {
            showSlides(slideIndex + 1);
        }, 2000); // Cambia la imagen cada 2 segundos
    }
}
