import express from 'express';
import cookieSession from 'cookie-session';
import path from 'path';

const app = express();

app.use(express.urlencoded({ extended: true }));
app.use(express.json());
app.use(express.static(path.join(path.resolve(), 'public')));
app.use(cookieSession({
    name: 'session',
    keys: [ 'key1', 'key2' ]
}));

app.set('views', './src/views');
app.set('view engine', 'pug');


app.get('/', (request, response) => {
    const student = request.session.studentData || null;
    request.session.studentData = null;

    response.render('index', {
        student
    });
});

app.post('/', (request, response) => {
    const _birthdate = request.body.birthdate.split('-').reverse().map(e => Number(e));
    const _today = new Date();

    request.session.studentData = {
        name: request.body.name,
        number: request.body.number,
        birthdate: _birthdate.map(e => e.toLocaleString('pt-BR', { useGrouping: false, minimumIntegerDigits: 2 })).join('/'),
        age: ((_today.getMonth() + 1) < _birthdate[ 1 ] || ((_today.getMonth() + 1) === _birthdate[ 1 ] && _today.getDate() < _birthdate[ 0 ]))
            ? _today.getFullYear() - _birthdate[ 2 ] - 1 // Ainda não fez aniversário
            : _today.getFullYear() - _birthdate[ 2 ] // Já fez aniversário
    };

    response.redirect('/');
});

app.listen(3333);