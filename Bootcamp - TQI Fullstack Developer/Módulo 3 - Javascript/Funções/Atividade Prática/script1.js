const alunos = [

    {
        nome : 'Leo',
        nota : 7,
        turma : '1º'
    },

    {
        nome : 'Bia',
        nota : 9,
        turma : '2º'
    },

    {
        nome : 'João',
        nota : 5,
        turma : '1º'
    }

];

function alunosAprovado (alunos, media){

    var aprovados = [];

    for (i = 0; i < alunosAprovado.length; i++){

        const {nota, nome} = alunos[i];

        if(nota >= media){

            aprovados.push(nome)

        }

    }

    return aprovados;

}

console.log(alunosAprovado (alunos, 6))