const exercises = {
    "01": "Apresentando mensagens de alerta",
    "02": "Apresentando mensagens de alerta pressionando botão",
    "03": "Receber 3 números e informar qual é o maior e o menor",
    "04": "Verificar se o usuário é menor de idade",
    "05": "Calcule a média aritmética de 3 números",
    "06": "Calcular o IMC do usuário. Use as TAGs: <input>, <button> e <div>",
    "07": "Encontre os múltiplos de 3 ou 5",
    "08": "Encontre a soma dos termos em uma sequência Fibonacci",
    "09": "Qual é o 1001º número primo?",
    "10": "Exibir números primos que estão entre o número 0 e o 200",
    "11": "Calcule o Delta de uma função de segundo grau",
    "12": "Inverta uma sequência de caracteres informada sem utilizar funções nativas JavaScript",
    "13": "Potênciação com qualquer base ou expoente",
    "14": "Potênciação exibindo os resultados de cada operação",
    "15": "Potênciação exibindo os resultados de cada operação utilizando o laço de repetição for",
    "16": "Potênciação exibindo os resultados de cada operação utilizando o laço de repetição for e a função matemática 'Math.pow()'",
    "17": "Somatório Matriz Array Diagonal",
    "18": "Calcule o somatório dos números pares de uma Matriz",
    "19": "Coloque em ordem crescente uma sequência de caracteres",
    "20": "Inverta uma sequência de caracteres informada utilizando funções nativas JavaScript"
};

for (exercise in exercises) {
    let strongNode = document.createElement('strong');
    let strongText = document.createTextNode(`Exercício ${ exercise }`);
    strongNode.appendChild(strongText);

    let spanNode = document.createElement('span');
    let spanText = document.createTextNode(exercises[ exercise ]);
    spanNode.appendChild(spanText);

    let element = document.getElementById(exercise);
    element.appendChild(strongNode);
    element.appendChild(spanNode);
    element.setAttribute('href', `/exercicios/${ exercise }/`);
}