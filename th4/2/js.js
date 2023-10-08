function solveQuadraticEquation() {
    var a = parseFloat(document.getElementById("aInput").value);
    var b = parseFloat(document.getElementById("bInput").value);
    var c = parseFloat(document.getElementById("cInput").value);

    var delta = b * b - 4 * a * c;

    if (delta < 0) {
        document.getElementById("result").innerText = "Phương trình vô nghiệm";
    } else if (delta === 0) {
        var x = -b / (2 * a);
        document.getElementById("result").innerText = "Phương trình có nghiệm kép\nx = " + x;
    } else {
        var x1 = (-b + Math.sqrt(delta)) / (2 * a);
        var x2 = (-b - Math.sqrt(delta)) / (2 * a);
        document.getElementById("result").innerText = "Phương trình có hai nghiệm phân biệt:\nx1 = " + x1 + "\nx2 = " + x2;
    }
}