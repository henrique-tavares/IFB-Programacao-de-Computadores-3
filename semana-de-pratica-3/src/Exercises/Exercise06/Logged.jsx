import Input from '../../components/Input';

import '../../styles/Exercises/Exercise06.css';

function Logged(props) {
    return (
        <section className="logged">
            <p className="greetings">
                Olá, { props.userName }
            </p>

            <Input type="button" value="Log out" onClick={ props.toSignIn } />
        </section>
    );
}

export default Logged;