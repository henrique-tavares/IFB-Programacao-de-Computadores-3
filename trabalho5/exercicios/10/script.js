function findPrimes(limit) {
    let primes = [ 2 ];

    for (let i = 3; primes[ primes.length - 1 ] < limit; i++) {
        if (primes.every(prime => i % prime != 0)) {
            primes.push(i);
        }
    }

    return primes;
}

function findPrimesWithin(bottom, top) {
    const element = document.getElementById('result');
    const primes = findPrimes(top);

    const filteredPrimes = primes.filter(prime => prime >= bottom && prime <= top);

    const maxDigits = Math.floor(Math.log10(primes[ primes.length - 1 ])) + 1;

    filteredPrimes.forEach(prime => {
        const resultItem = document.createElement('pre');
        resultItem.className = 'result-item';

        for (let i = Math.floor(Math.log10(prime)) + 1; i < maxDigits; i++) {
            prime = ' ' + prime;
        }

        resultItem.innerText = prime;

        element.appendChild(resultItem);
    });
}