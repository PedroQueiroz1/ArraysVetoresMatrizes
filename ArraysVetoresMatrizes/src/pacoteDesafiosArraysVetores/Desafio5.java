package pacoteDesafiosArraysVetores;

import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5. ");
		
		System.out.println("Digite o tamanho do array.");
		int n = sc.nextInt();
		int[] num1 = new int[n];
		int[] num2 = new int[n];
		int[] soma = new int[n];
		
		
		System.out.println("Você vai precisar digitar " + n + " números inteiros!");
		
		for(int nums=1; nums<3; nums++) {
			if(nums==1) {
				System.out.println("Digite para o "+ nums +" array.");
				for(int i = 0; i < n; i++) {
					System.out.println("Digite o [" + i + "] número inteiro!");
					num1[i] = sc.nextInt();
				}
			}
			if(nums==2) {
				System.out.println("Digite para o "+ nums +" array.");
				for(int i = 0; i < n; i++) {
					System.out.println("Digite o [" + i + "] número inteiro!");
					num2[i] = sc.nextInt();
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			soma[i] = num1[i] + num2[i];
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("Soma das posições de cada array");
			System.out.println("Soma do array " + i + ": " + soma[i]);
		}
		sc.close();
	}
	
}
