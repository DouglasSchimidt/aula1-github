package udemyCurso;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcool1 = 0;
		int gasolina2 = 0;
		int diesel3 = 0;
		int fim4 = 4;

		System.out.println("Digite o Codigo");

		int codigo = sc.nextInt();

		while (codigo != fim4) {
			
			

			if (codigo == 1) {

				alcool1 += 1;

			} else if (codigo == 2) {

				gasolina2 += 1;

			} else if (codigo == 3) {

				diesel3 += 1;
			}

			codigo = sc.nextInt();

		}
		

		System.out.println("Obrigado");

		System.out.printf("Alcool: %d%n", alcool1);
		System.out.printf("Gasolina: %d%n", gasolina2);
		System.out.printf("Diesel: %d%n", diesel3);
	}
}

