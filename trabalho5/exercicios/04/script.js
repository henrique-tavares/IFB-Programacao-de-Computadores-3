function verifyAge() {
    let age = document.getElementById('age').value;

    document.getElementById('age-result').innerText = (age >= 18) ? "Você é maior de idade" : "Você não é maior de idade";
}