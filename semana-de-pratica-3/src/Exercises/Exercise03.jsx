import { useState } from 'react';
import BaseExercise from '../components/BaseExercise';
import Input from '../components/Input';

import '../styles/Exercises/Exercise03.css';

class Aluno {
    #grade = Symbol('grade');
    #nr = Symbol('nr');

    constructor () {
        this[ this.#nr ] = this.generateNr();
        this[ this.#grade ] = this.generateGrade();
    }

    get nr() {
        return this[ this.#nr ];
    }

    get grade() {
        return this[ this.#grade ];
    }

    generateNr() {
        return (Math.random() * 100_000_000).toLocaleString('pt-BR', { useGrouping: false, minimumIntegerDigits: 9, maximumFractionDigits: 0 });
    }

    generateGrade() {
        return Math.round(Math.random() * 100);
    }

    equals(other) {
        return (this.nr === other.nr);
    }
}

function Exercise03() {

    const [ alunos, setAlunos ] = useState([]);
    const [ aprovados, setAprovados ] = useState(0);
    const [ reprovados, setReprovaodos ] = useState(0);

    function generateAlunos() {
        setAlunos([]);
        setAprovados(0);
        setReprovaodos(0);

        for (let i = 0; i < 20; i++) {
            const aluno = new Aluno();

            if (alunos.every(a => !a.equals(aluno))) {
                setAlunos(previous => [ ...previous, new Aluno() ]);

                if (aluno.grade >= 60) {
                    setAprovados(previous => previous + 1);
                } else {
                    setReprovaodos(previous => previous + 1);
                }
            }
        }
    }

    return (
        <BaseExercise
            title="Questão 03"
            description="Gerar um relatório de resultados da disciplina JavaScript para 20 alunos."
            id="ex03"
        >
            <Input type="button" value="Gerar relatório" onClick={ generateAlunos } />

            <section className="results-container">
                { alunos.length !== 0 && (
                    <>
                        <h5 className="result-title">
                            Relatórios de resultados para 20 alunos
                        </h5>

                        <hr className="result-hr" />

                        <div className="results">
                            { alunos.map(aluno => (
                                <>
                                    <h5 key={ aluno.nr } >Aluno { aluno.nr }</h5>
                                    <p>Nota { aluno.grade }</p>
                                    <span>[{ (aluno.grade >= 60) ? 'Aprovado' : 'Reprovado' }]</span>
                                </>
                            )) }
                        </div>

                        <hr className="result-hr" />

                        <span className="result-description">
                            <p>APROVADOS: { aprovados } ({ (aprovados / alunos.length * 100).toFixed() }%)</p>
                            <p>REPROVADOS: { reprovados } ({ (reprovados / alunos.length * 100).toFixed() }%)</p>
                        </span>
                    </>
                ) }
            </section>
        </BaseExercise>
    );
}

export default Exercise03;