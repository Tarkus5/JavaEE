package view;

import model.Dado;

public class Gioco1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dado d1 = new Dado();
		Dado d2 = new Dado();

		final int NUM_LANCI = 100_000;
		int vittorie = 0;
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < NUM_LANCI; i++) {
			int r1 = d1.lancia();
			int r2 = d2.lancia();
			System.out.println("Risultato tiro " + (i + 1) + ": " + r1 + " - " + r2);
			if (r1 == r2) {
				System.out.println("Hai vinto!");
				vittorie++;
			}
		}
		long stop = System.currentTimeMillis();
		System.out.println();
		System.out.println("Numero di vittorie totali: " + vittorie);
		System.out.println();
		System.out.println("Il programma ha impiegato " + (stop - start) + " millisecondi");
		System.out.println();
		System.out.println("La percentuale delle vittorie e' del " + (((double)vittorie/NUM_LANCI) * 100) + "%");
	}

}
