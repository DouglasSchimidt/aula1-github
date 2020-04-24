package Funcionário;

import java.util.Locale;
import java.util.Scanner;

import Entities.funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		funcionario func = new funcionario();
		
		
		
		System.out.print("Name: ");
		func.name = sc.nextLine();
		System.out.print("Gross salary: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Tax: ");
		func.imposto = sc.nextDouble();
		
		
		
		System.out.println("Employee: " + func.name +", " + func.salarioLiquido());
		
		System.out.println();
		
		System.out.println("Which percentage to increase salary? ");
		
		func.tax = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Updated data: Joao Silva: " + func.name +", " +  func.salarioFinal() );
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
