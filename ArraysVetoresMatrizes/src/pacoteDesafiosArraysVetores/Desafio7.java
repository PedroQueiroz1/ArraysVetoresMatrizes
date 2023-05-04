package pacoteDesafiosArraysVetores;

import java.util.Scanner;

public class Desafio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("7. ");
		
		System.out.println("Digite o tamanho do array.");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		
		System.out.println("Você vai precisar digitar " + n + " números inteiros!");
		
		int negNum = 0;
		for(int i=0;i<n;i++) {
			System.out.println("Digite o [" + i + "] número inteiro!");
			num[i] = sc.nextInt();
			if(num[i] < 0) {
				negNum++;
			}
		}
		
		System.out.println(negNum);
		sc.close();
	}	
}
