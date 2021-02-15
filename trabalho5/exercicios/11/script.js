function findDelta() {
    const a = Number(document.getElementById('a').value);
    const b = Number(document.getElementById('b').value);
    const c = Number(document.getElementById('c').value);

    const delta = (b ** 2) - (4 * a * c);

    document.getElementById('delta').innerText = delta.toLocaleString('pt-BR', { maximumFractionDigits: 2 });
}