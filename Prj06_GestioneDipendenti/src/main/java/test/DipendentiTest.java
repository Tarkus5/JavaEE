package test;

import java.util.ArrayList;

import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class DipendentiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dipendente> dipendenti = new ArrayList<>();
		dipendenti.add(new Fattorino("Mario", "Rossi"));
		dipendenti.add(new Impiegato("Luca", "Bianchi"));
		dipendenti.add(new Dirigente("Temistocle", "Arbarollo"));
		
		for (Dipendente d : dipendenti) {
			System.out.println(d);
		}
	}

}
