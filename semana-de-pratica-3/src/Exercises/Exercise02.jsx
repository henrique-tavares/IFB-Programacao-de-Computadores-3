import { useState } from 'react';
import BaseExercise from '../components/BaseExercise';
import Input from '../components/Input';

import '../styles/Exercises/Exercise02.css';

function Exercise02() {

    const [ inputNum, setInputNum ] = useState(null);
    const [ processedNum, setProcessedNum ] = useState(0);
    const [ factorial, setFactorial ] = useState(null);
    const [ calculationTime, setCalculationTime ] = useState(0);

    function calculateFactorial(num) {
        if (num === 0 || num === 1) {
            return 1;
        }

        return num * calculateFactorial(num - 1);
    }

    function handleFactorial() {
        if (!inputNum) {
            alert('Por favor, preencha o campo corretamente.');
            return;
        }

        let localNum = Math.floor(Number(inputNum));

        if (localNum < 0) {
            alert('Não foi possível calcular o fatorial de um número negativo.');
            return;
        }

        setProcessedNum(localNum);

        const start = Date.now();
        setFactorial(calculateFactorial(localNum));
        const end = Date.now();

        setCalculationTime(end - start);
    }

    return (
        <BaseExercise
            title="Questão 02"
            description="Calcular o fatorial de um número, e o tempo que levao para calcular."
            id="ex02"
        >
            <fieldset>
                <legend>Informe o número</legend>

                <div className="inputs-container">
                    <label htmlFor="factorial">Fatorial de</label>
                    <Input
                        type="number"
                        id="factorial"
                        placeholder="..."
                        value={ inputNum ?? "" }
                        onChange={ e => setInputNum(e.target.value) }
                    />
                </div>

                <Input type="button" value="Calcular" onClick={ handleFactorial } />
            </fieldset>

            <section className="results-container">
                { factorial && (
                    <>
                        <p>{ processedNum }! = {
                            (factorial > Number.MAX_SAFE_INTEGER)
                                ? factorial.toExponential(2)
                                : factorial.toLocaleString('pt-BR') }
                        </p>
                        <span>Levou { calculationTime }ms</span>
                    </>
                ) }
            </section>
        </BaseExercise>
    );
}

export default Exercise02;