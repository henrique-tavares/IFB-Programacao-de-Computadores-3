function reverseString() {
    const text = document.getElementById('string').value;
    const reversedText = text.split('').reverse().join('');

    document.getElementById('result').innerText = reversedText;
}