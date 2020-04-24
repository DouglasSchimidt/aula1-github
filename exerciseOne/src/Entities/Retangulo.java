package Entities;

public class Retangulo {

	public double larg, altura;

	public double area() {

		return altura * larg;

	}

	public double perimetro() {

		return 2 * (altura + larg);
	}

	public double diag() {

		double calcDiagonal = (altura * altura) + (larg * larg);

		double diagonal = calcDiagonal;

		return Math.sqrt(diagonal);

	}

}