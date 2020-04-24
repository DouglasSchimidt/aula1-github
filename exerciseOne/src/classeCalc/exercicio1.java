package classeCalc;


import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

import Entities.Retangulo;

public class exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		Retangulo retangulo = new Retangulo();
		
		
		

		
		System.out.println("Enter rectangle width and height:");
		
		retangulo.larg = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		
		
		
		System.out.printf("Area: %.2f%n", retangulo.area());
		System.out.printf("Perimetro: %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal: %.2f%n", retangulo.diag());
		
		
			
			
		
			
		}

}


