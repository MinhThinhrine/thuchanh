function countOccurrences() {
    var textA = document.getElementById("textA").value;
    var textB = document.getElementById("textB").value;
    // Kiểm tra nếu không có dữ liệu nhập vào
    if (textA.trim() === "" || textB.trim() === "") {
        var resultElement = document.getElementById("result");
        resultElement.innerText = "Vui lòng nhập đầy đủ dữ liệu! ";
        return; // Dừng thực hiện hàm
    }
    var count = 0;
    var position = textA.indexOf(textB);

    while (position !== -1) {
        count++;
        position = textA.indexOf(textB, position + 1);
    }

    var resultElement = document.getElementById("result");
    resultElement.innerText = "Số lần xuất hiện của B trong A: " + count;
}