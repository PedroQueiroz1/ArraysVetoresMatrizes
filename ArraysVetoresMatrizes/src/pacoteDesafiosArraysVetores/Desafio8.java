package pacoteDesafiosArraysVetores;

import java.util.Scanner;

public class Desafio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("8. ");
		
		System.out.println("Digite o tamanho do array.");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		
		System.out.println("Você vai precisar digitar " + n + " números inteiros!");
		
		int soma=0;
		int count=0;
		for(int i=0;i<n;i++) {
			System.out.println("Digite o [" + i + "] número inteiro!");
			num[i] = sc.nextInt();
			soma+=num[i];
			count++;
		}
		
		int countAcimaMedia = 0;
		int media = soma/count;
		System.out.println(media);
		
		for(int i = 0; i < n; i++) {
			if(media<num[i]) {
				countAcimaMedia++;
			}
		}
		
		System.out.println("Media: " + media);
		System.out.println(countAcimaMedia);
		sc.close();
	}	

}
