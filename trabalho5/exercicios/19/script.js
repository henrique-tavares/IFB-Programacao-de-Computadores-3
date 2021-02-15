function sortString() {
    const text = document.getElementById('string').value;
    const sortedText = text.split('').sort().join('');

    document.getElementById('result').innerText = sortedText;
}