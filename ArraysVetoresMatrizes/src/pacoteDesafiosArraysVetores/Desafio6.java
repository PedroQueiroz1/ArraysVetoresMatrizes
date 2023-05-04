package pacoteDesafiosArraysVetores;

import java.util.Scanner;

public class Desafio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("6. ");
		
		System.out.println("Digite o tamanho do array.");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		
		System.out.println("Você vai precisar digitar " + n + " números inteiros!");
		
		int somaPar = 0;
		for(int i=0;i<n;i++) {
			System.out.println("Digite o [" + i + "] número inteiro!");
			num[i] = sc.nextInt();
			if(num[i] % 2 == 0) {
				somaPar+=num[i];
			}
		}
		
		System.out.println(somaPar);
		sc.close();
	}	
}
