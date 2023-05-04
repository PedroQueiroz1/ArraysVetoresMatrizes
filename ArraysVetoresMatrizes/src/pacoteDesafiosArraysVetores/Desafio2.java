package pacoteDesafiosArraysVetores;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2. ");
		
		int[] num = new int[5];
		
		System.out.println("Você vai precisar digitar 5 números inteiros!");
		for(int i=0;i<5;i++) {
			System.out.println("Digite o [" + i + "] número inteiro!");
			num[i] = sc.nextInt();
		}
		
		/*
		 * MEDIA PAR
		 */
		int par=0;
		int mediaPar=0;
		int countPar=0;
		for(int i=0;i<5;i++) {
			if(num[i]%2==0) {
				par+=num[i];
				countPar++;
			}
		}	
		if(countPar!=0) {
		mediaPar = par/countPar;
		}else mediaPar=par;
		/*
		 * IMPRIME MEDIA PAR
		 */		
		System.out.println(mediaPar);
		
		/*
		 * MEDIA IMPAR
		 */
		int impar=0;
		int mediaImpar=0;
		int countImpar=0;
		
		for(int i=0;i<5;i++) {
			if(num[i]%2==1) {
				impar+=num[i];
				countImpar++;
			}
		}	
		if(countImpar!=0) {
		mediaImpar = impar/countImpar;
		}else mediaImpar=impar;
		/*
		 * IMPRIME MEDIA PAR
		 */		
		System.out.println(mediaImpar);
		sc.close();
	}
}
