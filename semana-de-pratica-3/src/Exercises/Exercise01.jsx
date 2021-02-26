import { useState } from 'react';

import BaseExercise from '../components/BaseExercise';
import Input from '../components/Input';

import '../styles/Exercises/Exercise01.css';

function Exercise01() {

    const [ min, setMin ] = useState();
    const [ max, setMax ] = useState();
    const [ multiples, setMultiples ] = useState([]);
    const factors = [ 2, 3 ];

    function calculateMultiples() {
        let bottom = min;
        let top = max;

        if (!bottom || !top) {
            alert('Por favor, preencha os campos corretamente');
            return;
        }

        bottom = Math.floor(Number(bottom));
        top = Math.floor(Number(top));

        if (bottom > top) {
            alert('O valor mínimo não pode ser maior do que o valor máximo');
            return;
        }

        setMultiples([]);
        for (let num = bottom + 1; num < top; num++) {
            if (factors.every(factor => num % factor === 0)) {
                setMultiples(previous => [ ...previous, num ]);
            }
        }
    }

    return (
        <BaseExercise
            title="Questão 01"
            description="Encontrar múltiplos de 2 e 3, entre um máximo e um mínimo."
            id="ex01"
        >
            <fieldset>
                <legend>Informe os limites</legend>

                <div className="inputs-container">
                    <label htmlFor="min">Valor mínimo</label>
                    <Input type="number" id="min" placeholder="..." value={ min ?? "" } onChange={ e => setMin(e.target.value) } />

                    <label htmlFor="max">Valor máximo</label>
                    <Input type="number" id="max" placeholder="..." value={ max ?? "" } onChange={ e => setMax(e.target.value) } />
                </div>

                <Input type="button" value="Calcular" onClick={ calculateMultiples } />
            </fieldset>

            <section className="results-container">
                { multiples.map(multiple => (
                    <div key={ multiple } className="result-item">{ multiple }</div>
                )) }
            </section>
        </BaseExercise>
    );
}

export default Exercise01;