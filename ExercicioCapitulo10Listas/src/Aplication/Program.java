package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import Entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		

		List <Funcionario> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");

		int quantityEmployee = sc.nextInt();

		for (int i = 0; i < quantityEmployee; i++) {

			System.out.println("ID: ");
			
			int id = sc.nextInt();
			
			System.out.println("Employee #" + i + ":");
			
			String name = sc.next();
			
			
			System.out.println("Salary: ");
			
			double salary = sc.nextDouble();
			
			list.add(new Funcionario(id, name, salary));
			
		}
		
		

			System.out.print("Enter the employee id that will have salary increase : ");
			int id = sc.nextInt();
			
			Funcionario emplo = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			
			if (emplo == null) {
				
				System.out.println("This id does not exist! ");
				
			}else {
				
				System.out.print("Enter the percentage: ");
				double percent = sc.nextDouble();
				emplo.increaseSalary(percent);
				
			}
			
			System.out.println("List of Employee: ");
			
			for (Funcionario obj : list) {
				
				System.out.println(obj);
			}
		
	}

	}
