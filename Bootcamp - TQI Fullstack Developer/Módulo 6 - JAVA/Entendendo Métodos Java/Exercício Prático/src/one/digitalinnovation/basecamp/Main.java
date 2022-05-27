package one.digitalinnovation.basecamp;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Exercício calculadora");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5, 2.5);
		
		System.out.println("Exercício Mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(15);
		Mensagem.obterMensagem(22);
		Mensagem.obterMensagem(4);
		
		System.out.println("Exercicio Empréstimo");
		Empréstimo.calcular(5000, Empréstimo.getDuasParcelas());
		Empréstimo.calcular(7850, Empréstimo.getTresParcelas());
		Empréstimo.calcular(12000, 2);
		Empréstimo.calcular(75480, 5);

	}

}
