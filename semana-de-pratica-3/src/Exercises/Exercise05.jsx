import { useState } from 'react';
import BaseExercise from '../components/BaseExercise';
import Input from '../components/Input';

import '../styles/Exercises/Exercise05.css';

function Exercise05() {

    const [ a, setA ] = useState(null);
    const [ b, setB ] = useState(null);
    const [ c, setC ] = useState(null);
    const [ triangle, setTriangle ] = useState(null);

    function defineTriangle() {
        if (!a || !b || !c) {
            alert('Por favor, preencher os campos corretamente.');
            return;
        }

        let _a = Number(a);
        let _b = Number(b);
        let _c = Number(c);

        if (_a <= 0 || _b <= 0 || _c <= 0) {
            alert('Os lados do triângulo não podem ser menores que 0.');
            return;
        }

        if (_a + _b <= _c || _a + _c <= _b || _b + _c <= _a) {
            alert('Este triângulo possui lados inválidos');
            return;
        }

        if (_a === _b && _b === _c) {
            setTriangle('Equilátero');
        } else if (_a !== _b && _a !== _c && _b !== _c) {
            setTriangle('Escaleno');
        } else {
            setTriangle('Isósceles');
        }
    }

    return (
        <BaseExercise
            title="Questão 05"
            description="Dizer se um triangulo é equilátero, isósceles ou escaleno dado os seus lados."
            id="ex05"
        >
            <fieldset>
                <legend>Informe os lados</legend>

                <div className="inputs-container">
                    <label htmlFor="a">Lado A</label>
                    <Input type="number" id="a" placeholder="..." value={ a ?? "" } onChange={ e => setA(e.target.value) } />

                    <label htmlFor="b">Lado B</label>
                    <Input type="number" id="b" placeholder="..." value={ b ?? "" } onChange={ e => setB(e.target.value) } />

                    <label htmlFor="c">Lado C</label>
                    <Input type="number" id="c" placeholder="..." value={ c ?? "" } onChange={ e => setC(e.target.value) } />
                </div>

                <Input type="button" value="Definir triângulo" onClick={ defineTriangle } />
            </fieldset>

            <section className="results-container">
                { triangle && (
                    <p>Este triângulo é: { triangle }</p>
                ) }
            </section>
        </BaseExercise>
    );
}

export default Exercise05;