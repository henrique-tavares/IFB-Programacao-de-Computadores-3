function calculateMultiples(...numbers) {
    let quantity = Number(document.getElementById('quantity').value);
    let multiples = [];

    for (let i = 1; multiples.length < quantity; i++) {
        if (numbers.some(num => i % num == 0)) {
            multiples.push(i);
        }
    }
    let maxDigits = Math.floor(Math.log10(multiples[ multiples.length - 1 ])) + 1;

    let multiplesContainer = document.getElementById('multiples-container');
    multiplesContainer.innerHTML = '';

    multiples.forEach(multiple => {
        let resultItem = document.createElement('pre');
        resultItem.className = 'result-item';

        for (let i = Math.floor(Math.log10(multiple)) + 1; i < maxDigits; i++) {
            multiple = ' ' + multiple;
        }
        resultItem.innerHTML = multiple;

        multiplesContainer.appendChild(resultItem);
    });
}