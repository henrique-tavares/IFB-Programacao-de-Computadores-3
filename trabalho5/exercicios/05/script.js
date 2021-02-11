function goBack() {
    location.href = '../../';
}

function findMinMax() {
    let numbersElements = document.getElementsByClassName('number-input');
    let numbers = [];
    for (numberElement of numbersElements) {
        numbers.push(Number(numberElement.value));
    }

    let mean = numbers.reduce((a, b) => a + b) / numbers.length;

    document.getElementById('media').querySelector('h5').innerText = mean.toFixed(2);
}