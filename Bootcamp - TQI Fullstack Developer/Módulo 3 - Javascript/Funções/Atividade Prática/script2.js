function calculaIdade(anos){
    return `Daqui a ${anos} anos, ${this.nome} terá ${this.idade + anos} anos de idade.`;
};

const pessoa1 = {
    nome: 'Sofia',
    idade: 10
};

const pessoa2 = {
    nome: 'Chelry',
    idade: 19
};

console.log(calculaIdade.call(pessoa2, 30));