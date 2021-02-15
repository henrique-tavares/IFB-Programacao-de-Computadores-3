function getIMCClassification(imc) {
    if (imc < 18.5) {
        return "Magreza";
    } else if (imc < 25) {
        return "Normal";
    } else if (imc < 30) {
        return "Sobrepeso";
    } else if (imc < 40) {
        return "Obesidade";
    } else {
        return "Obesidade grave";
    }
}

function calculateIMC() {
    let numbersElements = document.getElementsByClassName('number-input');
    let weight = 0, height = 0;
    for (numberElement of numbersElements) {
        if (numberElement.id == "weight") {
            weight = Number(numberElement.value);
        } else if (numberElement.id == "height") {
            height = Number(numberElement.value);
        }
    }

    let imc = weight / (height ** 2);

    document.getElementById('imc').querySelector('h5').innerText = imc.toLocaleString('pt-BR', { maximumFractionDigits: 2 });
    document.getElementById('imc-classification').innerText = getIMCClassification(imc);

}