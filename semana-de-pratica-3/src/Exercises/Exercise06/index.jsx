import { useState } from 'react';
import BaseExercise from '../../components/BaseExercise';
import Logged from './Logged';
import SignIn from './SignIn';
import SignUp from './SignUp';

import '../../styles/Exercises/Exercise06.css';

function Exercise06() {

    const lsUsersKey = 'users';

    const Scenarios = {
        signIn: <SignIn toSignUp={ () => setScenario(Scenarios.signUp) } handleSignIn={ handleSignIn } />,
        signUp: <SignUp toSignIn={ () => setScenario(Scenarios.signIn) } handleSignUp={ handleSignUp } />,
        toLogged(userName) {
            return <Logged toSignIn={ () => setScenario(Scenarios.signIn) } userName={ userName } />;
        }
    };

    const [ scenario, setScenario ] = useState(Scenarios.signIn);

    function handleSignIn(login, password) {
        if (!login || !password) {
            alert('Por favor, preencha os campos corretamente');
            return;
        }

        let user = {
            login,
            password
        };

        let lsUsers = JSON.parse(localStorage.getItem(lsUsersKey)) ?? [];

        if (lsUsers.some(lsUser => lsUser.login === user.login && lsUser.password === user.password)) {
            setScenario(Scenarios.toLogged(user.login));
        } else {
            alert('Esse usuário não existe!');
        }
    }

    function handleSignUp(login, password) {
        if (!login || !password) {
            alert('Por favor, preencha os campos corretamente');
            return;
        }

        let user = {
            login,
            password
        };

        let lsUsers = JSON.parse(localStorage.getItem(lsUsersKey)) ?? [];

        if (lsUsers.some(lsUser => lsUser.login === user.login)) {
            alert('Já existe um usuário com esse nome.');
        } else {
            try {
                localStorage.setItem(lsUsersKey, JSON.stringify([ ...lsUsers, user ]));
                alert('Usuário salvo com sucesso!');
                setScenario(Scenarios.signIn);
            } catch (error) {
                alert('Erro ao criar um usuário.');
            }
        }
    }

    return (
        <BaseExercise
            title="Questão 06"
            description="Simular um 'sign up' e 'sign in' de usuário."
            id="ex06"
        >
            { scenario }
        </BaseExercise>
    );
}

export default Exercise06;