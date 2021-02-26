import Footer from '../components/Footer';
import Header from '../components/Header';
import Exercise01 from '../Exercises/Exercise01';
import Exercise02 from '../Exercises/Exercise02';
import Exercise03 from '../Exercises/Exercise03';
import Exercise04 from '../Exercises/Exercise04';
import Exercise05 from '../Exercises/Exercise05';
import Exercise06 from '../Exercises/Exercise06/';

import '../styles/pages/Home.css';

function Home() {
    return (
        <div id="page-home">
            <Header style={ { zIndex: 1 } } />

            <main style={ { zIndex: 0 } }>
                <div className="exercises-container">
                    <Exercise01 />
                    <Exercise02 />
                    <Exercise03 />
                    <Exercise04 />
                    <Exercise05 />
                    <Exercise06 />
                </div>
            </main>

            <Footer style={ { zIndex: 1 } } />
        </div>
    );
}

export default Home;