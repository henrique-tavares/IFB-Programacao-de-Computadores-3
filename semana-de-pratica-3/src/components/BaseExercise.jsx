import '../styles/components/BaseExercise.css';

function BaseExercise(props) {
    return (
        <div className="exercise">
            <div className="title">
                <h3>{ props.title }</h3>
                <p>{ props.description }</p>
            </div>
            <hr />
            <div className={ `container ${ props.id }` } >
                { props.children }
            </div>
        </div>
    );
}

export default BaseExercise;