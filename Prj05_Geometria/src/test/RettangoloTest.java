package test;

import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;

public class RettangoloTest {

	public static void main(String[] args) {
		Segmento ab = new Segmento(new Punto(3, 2), new Punto(7, 2));
		Segmento ac = new Segmento(new Punto(3, 2), new Punto(3, 5));
		
		Rettangolo r = new Rettangolo(ab, ac);
		Quadrato q = new Quadrato(ab);
		
		Rettangolo[] scatole = new Rettangolo[2];
		scatole[0] = r;
		scatole[1] = q;
		/* Non dà nessun errore perchè abbiamo stabilito una realazione di ereditarietà
		tra quadrati e rettangoli, quindi possiamo metterli insieme in un array di oggetti
		AKA polimorfismo */
		
		System.out.println(r.calcolaSuperficie());
		System.out.println(q.calcolaSuperficie());

	}

}
