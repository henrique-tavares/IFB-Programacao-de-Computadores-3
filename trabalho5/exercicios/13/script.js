function exponentiation() {
    const base = Number(document.getElementById('base').value);
    const exponent = Number(document.getElementById('exponent').value);
    const result = base ** exponent;

    const resultElement = document.getElementById('result');
    resultElement.innerHTML = '';

    const exponentElement = document.createElement('sup');
    exponentElement.innerText = exponent.toLocaleString('pt-BR', { maximumFractionDigits: 2 });

    const expressionElement = document.createElement('div');
    expressionElement.innerText = base.toLocaleString('pt-BR', { maximumFractionDigits: 2 });
    expressionElement.appendChild(exponentElement);

    const equalElement = document.createElement('div');
    equalElement.innerText = '=';

    const exponentiationElement = document.createElement('div');
    exponentiationElement.innerText = `${ result.toLocaleString('pt-BR', { maximumFractionDigits: 2 }) }`;

    resultElement.appendChild(expressionElement);
    resultElement.appendChild(equalElement);
    resultElement.appendChild(exponentiationElement);
}