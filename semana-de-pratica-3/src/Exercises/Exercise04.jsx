import { useState } from 'react';
import BaseExercise from '../components/BaseExercise';
import Input from '../components/Input';

import '../styles/Exercises/Exercise04.css';

function Exercise04() {

    const [ qtd, setQtd ] = useState(null);
    const [ min, setMin ] = useState(null);
    const [ max, setMax ] = useState(null);
    const [ arr, setArr ] = useState(null);

    function range(start, stop) {
        let _arr = [ start ];
        while (_arr[ _arr.length - 1 ] < stop) {
            _arr.push(_arr[ _arr.length - 1 ] + 1);
        }

        return _arr;
    }

    function generateArray() {
        if (!qtd || !min || !max) {
            alert('Por favor, preencha os dados corretamente');
            return;
        }

        let _qtd = Math.floor(Number(qtd));
        let _min = Math.floor(Number(min));
        let _max = Math.floor(Number(max));

        if (_min > _max) {
            alert('O valor mínimo não pode ser maior que o valor máximo.');
            return;
        }

        if (_qtd < 0) {
            alert('A quantidade não pode ser menor que 0.');
            return;
        }

        if (_qtd > range(_min, _max).length) {
            alert('A quantidade não pode ser maior que o tanto de números entre os valores mínimo e máximo com eles incluso.');
            return;
        }

        let _arr = [];

        while (_arr.length < qtd) {
            let num = Math.round(Math.random() * (_max - _min) + _min);

            if (_arr.every(a => a !== num)) {
                _arr.push(num);
            }
        }

        setArr(_arr.sort((a, b) => a - b));
    }

    return (
        <BaseExercise
            title="Questão 04"
            description="Criar um array com números aleatórios, dado uma quantidade, valor máximo e mínimo."
            id="ex04"
        >
            <fieldset>
                <legend>Informe os dados</legend>

                <div className="inputs-container">
                    <label htmlFor="qtd">Quantidade de números</label>
                    <Input type="number" id="qtd" placeholder="..." value={ qtd ?? "" } onChange={ e => setQtd(e.target.value) } />

                    <label htmlFor="min">Valor mínimo</label>
                    <Input type="number" id="min" placeholder="..." value={ min ?? "" } onChange={ e => setMin(e.target.value) } />

                    <label htmlFor="max">Valor máximo</label>
                    <Input type="number" id="max" placeholder="..." value={ max ?? "" } onChange={ e => setMax(e.target.value) } />
                </div>

                <Input type="button" value="Criar" onClick={ generateArray } />
            </fieldset>

            <section className="results-container">
                { arr && (
                    arr.map(num => (
                        <div className="result-item">
                            { num }
                        </div>
                    ))
                ) }
            </section>
        </BaseExercise>
    );
}

export default Exercise04;