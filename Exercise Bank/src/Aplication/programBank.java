package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.calculator;

public class programBank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.next();

		System.out.print("Is there na initial deposit (y/n)? ");
		
		System.out.println();

		String InitialDeposit = sc.next();

		double balance = 0;

		calculator dados = new calculator();

		if (InitialDeposit.equals("y")) {

			System.out.print("Enter initial deposit value: ");

			balance = sc.nextDouble();

			
			dados.deposit(balance);

			System.out.println("Account Data: ");			
			dados.dados(name, numberAccount, balance);

		} else {
			
			System.out.println("Account Data: ");	
			dados.dados(name, numberAccount, balance);

		}
		
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");

		balance = sc.nextDouble();

		dados.deposit(balance);

		System.out.println("Updated account data: ");
		dados.dados(name, numberAccount, balance);

		System.out.println();
		System.out.println("Enter a withdraw value:");
		balance = sc.nextDouble();

		dados.whithdraw(balance);

		System.out.println("Updated account data: ");
		dados.dados(name, numberAccount, balance);

	}

}
