import { useState } from 'react';
import Input from '../../components/Input';

import '../../styles/Exercises/Exercise06.css';

function SignIn(props) {

    const [ login, setLogin ] = useState(null);
    const [ password, setPassword ] = useState(null);

    return (
        <section className="sign-in">
            <fieldset>
                <legend>Informe os dados</legend>

                <div className="inputs-container">
                    <label htmlFor="login">Usuário</label>
                    <Input
                        type="text"
                        id="login"
                        placeholder="..."
                        value={ login ?? "" }
                        onChange={ e => setLogin(e.target.value) }
                    />

                    <label htmlFor="password">Senha</label>
                    <Input
                        type="password"
                        id="password"
                        placeholder="..."
                        value={ password ?? "" }
                        onChange={ e => setPassword(e.target.value) }
                    />
                </div>

                <Input type="button" value="Sign in" onClick={ () => props.handleSignIn(login, password) } />
            </fieldset>

            <div className="to-sign-up" onClick={ props.toSignUp } >
                <p>Não possui cadastro?</p>
            </div>
        </section>
    );
}

export default SignIn;