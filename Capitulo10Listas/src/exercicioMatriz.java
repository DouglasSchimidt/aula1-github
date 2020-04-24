import java.util.Scanner;

public class exercicioMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int [][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				mat[i][j] = sc.nextInt();

			}

		}

		int x = sc.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
				System.out.print("Position: " + i + ","  + j + ":" );
				
				if (mat [i][j] == x ) {
					
					
					if (j > 0) {
					System.out.println("Left: " + mat[i] [j-1]);
					}
					if (i > 0 ) {
					System.out.println("Right: " + mat [i+1]);
					}
					if (j < mat[i].length-1) {
					System.out.println("Up: " + mat [i][j+1] );
					}
					
					if (i < mat.length-1)
					System.out.println("Down: " + mat [i+1][j]);
					
				}
				
				

			}

		}
		sc.close();
	}

}
