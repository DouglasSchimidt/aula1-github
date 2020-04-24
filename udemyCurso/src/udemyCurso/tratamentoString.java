package udemyCurso;

public class tratamentoString {

	public static void main(String[] args) {
		
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();  //todas Minusculas
		String s02 = original.toUpperCase();  //todas maiusculas
		String s03 = original.trim(); 		  //Tira os Espaços	
		String s04 = original.substring(2);   //corta a string de um posto estipulado (2)
		String s05 = original.substring(2, 9); 
		String s06 = original.replace('a', 'x'); //Substitui String A por X
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc"); //diz a posição da String "bc" posição 2
		int j = original.lastIndexOf("bc"); // ultima posição da string solicitada
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		
	}

}
