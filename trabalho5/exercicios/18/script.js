
function createMatrix() {
    const lines = Number(document.getElementById('lines').value);
    const columns = Number(document.getElementById('columns').value);

    if (lines <= 0 || columns <= 0) {
        alert('A quantidade de linhas e colunas precisam ser maiores que 0');
        return;
    }

    const matrix = document.getElementById('matrix');
    matrix.innerHTML = '';

    for (let i = 0; i < lines; i++) {
        let matrixLine = document.createElement('div');
        matrixLine.className = 'matrix-line';

        for (let j = 0; j < columns; j++) {
            let matrixItem = document.createElement('input');
            matrixItem.type = 'number';
            matrixItem.className = 'matrix-item';
            matrixItem.id = `${ i }${ j }`;

            matrixLine.appendChild(matrixItem);
        }

        matrix.appendChild(matrixLine);
    }

    if (document.getElementById('matrix-container').querySelector('.button') == null) {
        const calculateEvenSumButton = document.createElement('input');
        calculateEvenSumButton.type = 'button';
        calculateEvenSumButton.className = 'button';
        calculateEvenSumButton.value = 'Calcular a soma dos números pares';
        calculateEvenSumButton.setAttribute('onclick', 'calculateEvenSum()');

        matrix.insertAdjacentElement('afterend', calculateEvenSumButton);
    }
}

function calculateEvenSum() {
    const lines = Number(document.getElementById('lines').value);
    const columns = Number(document.getElementById('columns').value);

    let prevResultElement = document.getElementById('result');

    if (prevResultElement) {
        prevResultElement.remove();
    }

    let evenSum = 0;

    for (let i = 0; i < lines; i++) {
        for (let j = 0; j < columns; j++) {
            let num = Number(document.getElementById(`${ i }${ j }`).value);

            evenSum += (num % 2 == 0) ? num : 0;
        }
    }

    const resultElement = document.createElement('div');
    resultElement.className = 'result';
    resultElement.id = 'result';

    let textBoldItem = document.createElement('strong');
    textBoldItem.innerText = 'Soma dos números pares:';

    resultElement.appendChild(textBoldItem);
    resultElement.append(evenSum);

    document.getElementById('matrix-container').appendChild(resultElement);
}