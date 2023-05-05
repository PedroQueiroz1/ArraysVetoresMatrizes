package pacoteDesafiosMatrizes;

import java.util.Scanner;

//2. Escreva um programa que receba como entrada uma matriz de inteiros e determine se ela
// é simétrica em relação à diagonal principal (ou seja, se aij = aji para todos os elementos i e j).
public class Desafio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2. ");
		
		System.out.println("Digite a qtd de linhas e colunas da matriz");
		int lin = sc.nextInt();
		int col = lin;
		
		int[][] matriz1 = new int[lin][col];
		
		System.out.println("Primeira matriz.");
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				System.out.println("Digite um número");
				matriz1[i][j] = sc.nextInt();
			}
		}
		
		boolean simetrica = true;
		System.out.println("É simétrica?");
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				if(matriz1[i][j] != matriz1[j][i]) {
					simetrica = false;
					break;
				}
			}
			if(!simetrica) {
				break;
			}
		}
		if(simetrica == true) {
			System.out.println("SIM!");
		}else System.out.println("NAO!");
		sc.close();
	}
}
