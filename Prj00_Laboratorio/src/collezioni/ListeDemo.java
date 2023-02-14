package collezioni;

import java.util.ArrayList;

public class ListeDemo {

	public static void main(String[] args) {
		
		// ARRAYLIST - Una list dentro la quale c'è un array ridimensionabile
		ArrayList<String> parole = new ArrayList<>();
		
		parole.add("Pippo");
		parole.add("Topolino");
		parole.add("Paperino");
		parole.add("Zio Paperone");
		parole.add("Gastone");
		
		System.out.println(parole.size());
		
		for (String string : parole) {
			System.out.print(string + ", ");
		}
	}

}
