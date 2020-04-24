package arrays;

import java.util.Locale;
import java.util.Scanner;

import pensão.Cadastro;

public class programPensao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		Cadastro[] vect = new Cadastro[10];

		System.out.print("How many rooms will be rented? ");

		int numeroQuartos = sc.nextInt();

		for (int i = 0; i < numeroQuartos; i++) {

			System.out.println("Rent # " + (i + 1) + ":");

			sc.nextLine();
			System.out.print("Name: ");

			String name = sc.nextLine();
			System.out.print("Email: ");

			String email = sc.nextLine();

			System.out.print("Room: ");

			int numberRoom = sc.nextInt();

			vect[numberRoom] = new Cadastro(name, email, numberRoom);
			System.out.println();

		}
		
		System.out.println();
		System.out.println("Busy Rooms: ");
		for (int i = 0; i < vect.length; i++) {

			if (vect[i] != null) {

				System.out.println(vect[i].toString());
				sc.close();

			}

		}

	}

}
