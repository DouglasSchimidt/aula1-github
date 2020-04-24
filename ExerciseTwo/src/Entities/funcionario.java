package Entities;

public class funcionario {
	
	public String name;
	public double salarioBruto ;
	public double imposto;
	public double tax;
	
	public double salarioLiquido() {
		
		return salarioBruto - imposto;
		
		
	}
	
	public double increaseSalary() {
		
		double porcent = 0;
		
		return (salarioBruto * porcent) /100;
		
	}
	
	public double salarioFinal () {
		
		
		return (salarioBruto * tax) / 100 + salarioLiquido();
		
		
		
	}
	

}
