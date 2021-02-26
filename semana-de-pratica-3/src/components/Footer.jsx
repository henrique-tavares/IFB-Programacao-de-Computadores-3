import '../styles/components/Footer.css';

import githubImg from '../assets/GitHub-Mark-Light-32px.png';

function Footer() {
    return (
        <footer>
            <p>Desenvolvido por <strong>Henrique Tavares Aguiar</strong></p>
            <a href="https://github.com/henrique-tavares">
                <img src={ githubImg } alt="GitHub" />
            </a>
        </footer>
    );
}

export default Footer;