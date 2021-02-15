function exponentiation() {
    const base = Number(document.getElementById('base').value);
    const exponent = Math.floor(Number(document.getElementById('exponent').value));
    let currentResult = 1;

    const resultContainerElement = document.getElementById('results-container');
    resultContainerElement.innerHTML = '';

    for (let i = 1; i <= exponent; i++) {
        let preExpressionElement = document.createElement('div');
        preExpressionElement.className = 'pre-expression';
        preExpressionElement.innerText = base;

        let currentExponentElement = document.createElement('sup');
        currentExponentElement.innerText = i;

        preExpressionElement.appendChild(currentExponentElement);
        preExpressionElement.append(':');

        let expressionElement = document.createElement('div');
        expressionElement.innerText = `${ currentResult.toLocaleString('pt-BR', { maximumFractionDigits: 2 }) } x ${ base.toLocaleString('pt-BR', { maximumFractionDigits: 2 }) }`;
        expressionElement.className = 'expression';

        let equalElement = document.createElement('div');
        equalElement.innerText = '=';

        currentResult *= base;

        let exponentiationElement = document.createElement('div');
        exponentiationElement.innerText = `${ currentResult.toLocaleString('pt-BR', { maximumFractionDigits: 2 }) }`;
        exponentiationElement.className = 'exponentiation';

        resultContainerElement.appendChild(preExpressionElement);
        resultContainerElement.appendChild(expressionElement);
        resultContainerElement.appendChild(equalElement);
        resultContainerElement.appendChild(exponentiationElement);
    }
}