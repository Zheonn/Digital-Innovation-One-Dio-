package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int count = 0;
		int maior = 0;
		int soma = 0;
		
		do {
			
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			soma = soma + numero;
			
			if(numero > maior) maior = numero;
			
			count += 1;
			
		}while(count < 5);
		
		System.out.println("Maior número: " + maior);
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + soma / 5);
		
	}
	
}
