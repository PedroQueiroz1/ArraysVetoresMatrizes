package pacoteDesafiosMatrizes;

import java.util.Scanner;

public class Desafio1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. ");
		
		System.out.println("Digite a qtd de linhas da matriz");
		int lin = sc.nextInt();
		System.out.println("Digite a qtd de colunas da matriz");
		int col = sc.nextInt();
		
		int[][] matriz1 = new int[lin][col];
		int[][] matriz2 = new int[lin][col];;
		int[][] somaMatriz = new int[lin][col];
		
		System.out.println("Primeira matriz.");
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				System.out.println("Digite um número");
				matriz1[i][j] = sc.nextInt();
			}
		}
		 
		
		System.out.println("Segunda matriz.");
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				System.out.println("Digite um número");
				matriz2[i][j] = sc.nextInt();
			}
		}
		
		
		/*
		 * SOMA
		 */
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				somaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
				System.out.println(somaMatriz[i][j]);
			}
		}
	
		sc.close();
	}
	
}
