package pacoteDesafiosArraysVetores;

import java.util.Scanner;

public class Desafio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10. ");
		
		System.out.println("Digite o tamanho do array.");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		
		System.out.println("Você vai precisar digitar " + n + " números inteiros!");
		
		for(int i=0;i<n;i++) {
			System.out.println("Digite o [" + i + "] número inteiro!");
			num[i] = sc.nextInt();
		}
		
        for (int i = 1; i < n; i++) {
            int chave = num[i];
            int j = i - 1;
            while (j >= 0 && num[j] > chave) {
                num[j + 1] = num[j];
                j--;
            }
            num[j + 1] = chave;
        }
		
		System.out.println("Ordenado: ");
		for(int i = 0; i < n; i++) {
			System.out.println(i + ": " + num[i]);
		}
		sc.close();
	}	
}
