package pacoteDesafiosMatrizes;

import java.util.Scanner;

/*
 *  Escreva um programa que receba como entrada uma matriz de inteiros 
 *  e determine se ela é um quadrado mágico (ou seja, a soma de todas as linhas, colunas e diagonais é igual).
 */
public class Desafio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3. ");
		
		System.out.println("Digite a qtd de linhas e colunas da matriz");
		int lin = sc.nextInt();
		int col = lin;
		
		int[][] matriz1 = new int[lin][col];
		int[] somaLinha = new int[lin];
		int[] somaColuna = new int[col];
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;
		
		System.out.println("Primeira matriz.");
		for(int i = 0; i < lin; i++) {
			for(int j = 0; j < col; j++) {
				System.out.println("Digite um número");
				matriz1[i][j] = sc.nextInt();
				somaLinha[i] += matriz1[i][j];
				somaColuna[j] += matriz1[i][j];
				
				if(i==j) {
					somaDiagonalPrincipal += matriz1[i][j];
					}
				if(i+j == lin - 1) {
					somaDiagonalSecundaria += matriz1[i][j];
				}
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL: " +somaDiagonalPrincipal);
		System.out.println("DIAGONAL SECUNDARIA: " +somaDiagonalSecundaria);
		System.out.println("LINHA: " +somaLinha);
		System.out.println("COLUNA: " +somaColuna);
		
		  boolean quadradoMagico = true;
	        int somaEsperada = somaLinha[0];
	        for (int i = 1; i < lin; i++) {
	            if (somaLinha[i] != somaEsperada || somaColuna[i] != somaEsperada) {
	                quadradoMagico = false;
	                break;
	            }
	        }
	        if (somaDiagonalPrincipal != somaEsperada || somaDiagonalSecundaria != somaEsperada) {
	            quadradoMagico = false;
	        }

	        if (quadradoMagico) {
	            System.out.println("A matriz é um quadrado mágico");
	        } else {
	            System.out.println("A matriz não é um quadrado mágico");
	        }

		
		
		sc.close();
	}
}
