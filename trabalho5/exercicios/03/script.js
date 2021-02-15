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
        numbers.push(Number(numberElement.value));
    }

    let [ min, max ] = minMax(numbers);

    document.getElementById('maior').querySelector('h5').innerText = max.toLocaleString('pt-BR', { maximumFractionDigits: 2 });
    document.getElementById('menor').querySelector('h5').innerText = min.toLocaleString('pt-BR', { maximumFractionDigits: 2 });
}