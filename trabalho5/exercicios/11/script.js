function goBack() {
    location.href = '../../';
}

function findDelta() {
    const a = document.getElementById('a').value;
    const b = document.getElementById('b').value;
    const c = document.getElementById('c').value;

    const delta = (b ** 2) - (4 * a * c);

    document.getElementById('delta').innerText = delta;
}