package arraysVetoresMatrizes;

public class Matrizes {

	public static void main(String[] args) {
		
		int notas[][] = new int[1][3];
		
		notas[0][0] = 80;
		notas[0][1] = 70;
		notas[0][2] = 60;
		
		for(int i = 0; i < 1; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Nota da linha "+i+" da coluna "+j);
				System.out.println(notas[i][j]);
			}
		}
	}
}
