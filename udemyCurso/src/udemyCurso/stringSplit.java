package udemyCurso;

public class stringSplit {

	public static void main(String[] args) {
		
		String s = "potato apple lemon";
		String[] vect = s.split(" "); //vetoriza a varialvel "s" separando as palavras pelos espa�os em branco " ".
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(vect [0]);
		System.out.println(vect [1]);
		System.out.println(vect [2]);

	}

}
