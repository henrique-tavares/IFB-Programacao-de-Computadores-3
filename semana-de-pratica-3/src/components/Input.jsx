import '../styles/components/Input.css';

function Input(props) {
    return (
        <input
            className="input"
            type={ props.type }
            id={ props.id }
            placeholder={ props.placeholder }
            onChange={ props.onChange }
            value={ props.value }
            onClick={ props.onClick }
        />
    );
}

export default Input;