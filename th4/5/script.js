var imageElement = document.getElementById("image");
var rotation = 0;

setInterval(function() {
    rotation += 15;
    imageElement.style.transform = "rotate(" + rotation + "deg)";
}, 2000);