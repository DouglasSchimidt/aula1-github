package udemyCurso;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int senha =sc.nextInt();
		
		
		
		
		while (senha != 2002) {
			
		System.out.println("Senha Incorreta");
			
		senha=sc.nextInt();	
		
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
;		
		
		

	}

}
