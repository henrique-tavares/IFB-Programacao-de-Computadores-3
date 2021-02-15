function fibonacci(num) {
    if (num <= 0) {
        return [ 0 ];
    } else if (num == 1) {
        return [ 0, 1 ];
    }
    let prev = fibonacci(num - 1);
    return [ ...prev, prev[ prev.length - 1 ] + prev[ prev.length - 2 ] ];
}

function fibonacciSum() {
    let quantity = Number(document.getElementById('quantity').value);
    let fib = fibonacci(quantity);
    let sum = fib.reduce((a, b) => a + b);

    document.getElementById('fib-result').innerText = sum.toLocaleString('pt-BR', { maximumFractionDigits: 2 });
}