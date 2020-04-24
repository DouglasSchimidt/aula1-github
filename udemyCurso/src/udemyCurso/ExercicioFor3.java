package udemyCurso;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero de Testes");
		 
		int n = sc.nextInt();
		
		double mediageral = 0;
		double media1 = 0;
		double media2 = 0;
		double media3 = 0;
		
		for (int i = 0; i < n; i++) {
			
			media1 = sc.nextDouble();
			media2 = sc.nextDouble();			
			media3 = sc.nextDouble();
			
			mediageral = (media1 * 2.0 +media2 * 3.0 +media3 * 5.0) / 10;
			
			System.out.printf("%.1f%n", mediageral);
		}
		
		sc.close();

	}

}
