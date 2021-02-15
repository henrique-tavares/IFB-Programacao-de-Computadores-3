function reverseString() {
    const text = document.getElementById('string').value;
    let reversedText = '';

    for (let i = text.length - 1; i >= 0; i--) {
        reversedText += text[ i ];
    }

    document.getElementById('result').innerText = reversedText;
}