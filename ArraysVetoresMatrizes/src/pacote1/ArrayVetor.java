package pacote1;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		
		/* ---- PRIMEIRA AULA ---- */
		try (Scanner sc = new Scanner(System.in)) {
			
			
			System.out.println("Digite a quantidade de posições do array");
			String count = sc.nextLine();
			
			/* Array pode ser de todos os tipos de dados e objetos também*/
			
			/* Array */
			double notas1[];
			
			/* Array sempre deve ter uma quantidade de posições definidas */
			double[] notas2 = new double[Integer.parseInt(count)];
			
			/* Atribuindo valor para cada posição do array */
			for (int pos = 0; pos < notas2.length; pos++) {
				System.out.println("Dê um valor para a posição " + pos);
				notas2[pos] = sc.nextInt();
			}
			
			/* Imprimindo os valores */
			for (int pos = 0; pos <notas2.length; pos++) {
				System.out.println(notas2[pos]);
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	
		
		/* ---- SEGUNDA AULA ---- */
		
		/*Atribuindo valores a um array de String*/
		String[] valores1 = new String[4];
		
		String[] valores2 = {"Pedro","95","Curso Java","contato@outlook.com","99"};
		
		valores1[0] = "Pedro";
		valores1[1] = "90";
		valores1[2] = "Curso Java";
		valores1[3] = "contato@outlook.com";
		
	}
}
