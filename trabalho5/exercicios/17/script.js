function createMatrix() {
    const lines = Number(document.getElementById('lines').value);
    const columns = Number(document.getElementById('columns').value);

    if (lines <= 0 || columns <= 0) {
        alert('A quantidade de linhas e colunas precisam ser maiores que 0');
        return;
    }

    if (lines != columns) {
        alert('A quantidade de linhas e colunas precisa ser a mesma');
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
        const calculateDiagonalButton = document.createElement('input');
        calculateDiagonalButton.type = 'button';
        calculateDiagonalButton.className = 'button';
        calculateDiagonalButton.value = 'Calcular a soma das diagonais';
        calculateDiagonalButton.setAttribute('onclick', 'calculateDiagonal()');

        matrix.insertAdjacentElement('afterend', calculateDiagonalButton);
    }
}

function calculateDiagonal() {
    const lines = Number(document.getElementById('lines').value);
    const columns = Number(document.getElementById('columns').value);

    let prevResultContainer = document.getElementById('result-container');

    if (prevResultContainer) {
        prevResultContainer.remove();
    }

    let primaryDiagonal = 0, secondaryDiagonal = 0;

    for (let i = 0; i < lines; i++) {
        for (let j = 0; j < columns; j++) {
            if (i == j) {
                primaryDiagonal += Number(document.getElementById(`${ i }${ j }`).value);
                secondaryDiagonal += Number(document.getElementById(`${ columns - i - 1 }${ j }`).value);
            }
        }
    }

    const resultContainer = document.createElement('div');
    resultContainer.className = 'result-container';
    resultContainer.id = 'result-container';

    let textBoldItem = document.createElement('strong');
    textBoldItem.innerText = 'Diagonal primária:';

    resultContainer.appendChild(textBoldItem);
    resultContainer.append(primaryDiagonal);

    textBoldItem = document.createElement('strong');
    textBoldItem.innerText = 'Diagonal secundária:';

    resultContainer.appendChild(textBoldItem);
    resultContainer.append(secondaryDiagonal);

    document.getElementById('matrix-container').appendChild(resultContainer);
}