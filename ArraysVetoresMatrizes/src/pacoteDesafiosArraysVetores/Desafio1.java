package pacoteDesafiosArraysVetores;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. ");
		
		int[] num = new int[5];
		
		System.out.println("Você vai precisar digitar 5 números inteiros!");
		for(int i=0;i<5;i++) {
			System.out.println("Digite o [" + i + "] número inteiro!");
			num[i] = sc.nextInt();
		}
		
		int pos;
		for(int i=4;i>=0;i--) {
			pos=num[i];
			System.out.print(pos + ", ");
		}
		sc.close();
	}
	
		
}
