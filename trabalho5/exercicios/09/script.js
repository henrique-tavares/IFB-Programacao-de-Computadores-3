function findPrimes(qtd) {
    if (qtd <= 0) {
        return 0;
    } else if (qtd == 1) {
        return [ 2 ];
    }

    const prev = findPrimes(qtd - 1);
    let newPrime;

    for (let i = prev[ prev.length - 1 ] + 1; newPrime == undefined; i++) {
        if (prev.every(prime => i % prime != 0)) {
            newPrime = i;
        }
    }

    return [ ...prev, newPrime ];
}

function findNthPrime(nth) {
    const element = document.getElementById('result');
    const primes = findPrimes(nth);

    const nthPrime = primes[ primes.length - 1 ];

    element.append(` ${ nthPrime.toLocaleString('pt-BR', { maximumFractionDigits: 2 }) }`);
}