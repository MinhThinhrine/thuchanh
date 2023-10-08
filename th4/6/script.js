    window.onload = function() {
    var form = document.getElementById("container");
    var emailInput = document.querySelector("#email");

    form.addEventListener("submit", function(event) {
    event.preventDefault();
    validateEmail();
});

    function validateEmail() {
    var email = emailInput.value;

    if (!isValidEmail(email)) {
    emailInput.classList.add("error");
    alert("Invalid email address");
} else {
    emailInput.classList.remove("error");
    alert("Email address is valid");
    form.submit();
}
}

    function isValidEmail(email) {
    var emailRegex = /^[a-zA-Z0-9]+(\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\.[a-zA-Z]{2,}$/;
    return emailRegex.test(email);
}
}
