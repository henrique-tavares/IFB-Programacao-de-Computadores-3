function goBack() {
    location.href = '../../';
}

function minMax(arr) {
    let min, max;

    for (num of arr) {
        min = (min) ? ((num < min) ? num : min) : num;
        max = (max) ? ((num > max) ? num : max) : num;
    }

    return [ min, max ];
}

function findMinMax() {
    let numbersElements = document.getElementsByClassName('number-input');
    let numbers = [];
    for (numberElement of numbersElements) {
        numbers.push(numberElement.value);
    }

    let [ min, max ] = minMax(numbers);

    document.getElementById('maior').querySelector('h5').innerText = max;
    document.getElementById('menor').querySelector('h5').innerText = min;
}