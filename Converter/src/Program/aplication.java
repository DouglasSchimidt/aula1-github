package Program;

import java.util.Locale;
import java.util.Scanner;

import utill.currencyConverter;



public class aplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		double real = sc.nextDouble();
		
		double valorFinal = currencyConverter.ValorConvertido(dollar, real);
	
		System.out.printf("Amount to be paid in reais %.2f%n ", valorFinal);
		
		
		sc.close();
	}

}
