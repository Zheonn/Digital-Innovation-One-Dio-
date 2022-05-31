package br.com.dio.exercicios.arrays;

import java.util.*;

public class Ex3_NumerosAleatorios {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
			
		}
		
		System.out.println("Números aleatórios: ");
		
		for (int numero: numerosAleatorios) {
			
			System.out.println(numero + " ");
			
		}
		
	}
	
}
