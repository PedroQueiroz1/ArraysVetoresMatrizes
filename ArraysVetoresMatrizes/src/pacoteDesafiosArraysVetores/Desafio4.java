package pacoteDesafiosArraysVetores;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("4. ");
		
		System.out.println("Digite o tamanho do array.");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		
		System.out.println("Você vai precisar digitar " + n + " números inteiros!");
		
		int maiorValor=0;
		int menorValor = 0;
		for(int i=0;i<n;i++) {
			
			System.out.println("Digite o [" + i + "] número inteiro!");
			
			num[i] = sc.nextInt();

			if(i==0) {
				menorValor=num[i];
			}
			
			if(maiorValor<num[i]) {
				maiorValor=num[i];
			}
			
			if(menorValor>num[i]) {
				menorValor=num[i];
			}
		}

		System.out.println("Maior: " + maiorValor);
		System.out.println("Menor: " + menorValor);
		
		sc.close();
	}
}
