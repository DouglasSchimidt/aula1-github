package utill;

public class currencyConverter {
	
	public static final double IOF = 6.0;
	
	
	public static double ValorConvertido (double dollar, double real) {
		
		double val = dollar * real;
		return val+=(val *  IOF)/100 ;
		
	}

}
