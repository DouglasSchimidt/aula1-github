package udemyCurso;

import java.util.Scanner;

public class EcercicioFor7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		int quad = 0;
		int cubo = 0;		
		
		for (int i = 1; i <=num ; i++) {
			
			
			quad = i * i;	
			cubo = i * i * i;
			
			System.out.println("" + i + " "  + quad + " "  + cubo );
			
			
		}
		
		
		
	}

}
