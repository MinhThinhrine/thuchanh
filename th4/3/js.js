var greetings = ["Xin chao", "Hello", "Bonjour", "Hola", "Ciao"];

function getRandomGreeting() {
    var randomIndex = Math.floor(Math.random() * greetings.length);
    return greetings[randomIndex];
}

var greetingElement = document.getElementById("greeting");
greetingElement.innerText = getRandomGreeting();