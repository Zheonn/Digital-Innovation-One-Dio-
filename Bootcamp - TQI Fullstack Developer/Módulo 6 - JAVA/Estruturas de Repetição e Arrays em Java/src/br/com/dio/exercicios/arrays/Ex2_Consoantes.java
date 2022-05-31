package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva seis letras do alfabeto em maíusculo:");
		
		char letra1 = scan.next().charAt(0);
		char letra2 = scan.next().charAt(0);
		char letra3 = scan.next().charAt(0);
		char letra4 = scan.next().charAt(0);
		char letra5 = scan.next().charAt(0);
		char letra6 = scan.next().charAt(0);
		
		int consoantes = 0;
		int vogais = 0;
		
		char[] letras = {letra1, letra2, letra3, letra4, letra5, letra6};
		
		for(int index = 0; index <= letras.length - 1; index++) {
			
			System.out.println(letras[index]);
			
			if(letras[index] == 'A' | letras[index] == 'E' | letras[index] == 'I'
			| letras[index] == 'O' | letras[index] == 'U'){
				
				vogais++;
				
			}
			else {
				
				consoantes++;
				
			}
			
		}
		
		System.out.println("Número de consoantes: " + consoantes);
		System.out.println("Número de vogais: " + vogais);
		
	}
	
}
