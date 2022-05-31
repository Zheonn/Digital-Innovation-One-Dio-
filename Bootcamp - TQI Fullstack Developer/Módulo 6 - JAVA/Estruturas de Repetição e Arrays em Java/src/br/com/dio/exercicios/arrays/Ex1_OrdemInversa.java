package br.com.dio.exercicios.arrays;

public class Ex1_OrdemInversa {

	public static void main (String[] args) {
		
		int[] vetor = {1, 3, 5, 7, 9, 11};
		
		for(int i = (vetor.length) - 1; i > -1; i--) {
			
			int index = i;
			System.out.println(vetor[index]);
			
		}
		
	}
	
}
