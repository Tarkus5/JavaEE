package gioco;

import java.util.Scanner;

public class CartaForbiciSasso {

	public static void main(String[] args) {

		String sceltaUmano = chiediUmano();
		String sceltaPc = chiediPc();
		String result = valuta(sceltaUmano, sceltaPc);
		System.out.println("Umano : " + sceltaUmano);
		System.out.println("Pc: " + sceltaPc);
		System.out.println("Ha vinto " + result);

	}

	public static String valuta(String sceltaUmano, String sceltaPc) {
		String result = null;
		if (sceltaUmano.equalsIgnoreCase(sceltaPc)) {
			result = "nessuno! Pareggio!";
		} else {
			if (sceltaUmano.equalsIgnoreCase("forbici")) {
				if (sceltaPc.equalsIgnoreCase("carta"))
					result = "l'umano!";
				else {
					result = "il PC!";
				}

			} else if (sceltaUmano.equalsIgnoreCase("carta")) {

				if (sceltaPc.equalsIgnoreCase("sasso")) {
					result = "l'umano";
				} else {
					result = "il PC!";
				}
			}
			if (sceltaUmano.equalsIgnoreCase("sasso")) {
				if (sceltaPc.equalsIgnoreCase("forbici"))
					result = "l'umano";
				else {
					result = "il PC!";
				}
			}

		}
		return result;
	}

	public static String chiediPc() {
		double casuale = Math.random();
		if (casuale < 0.33) {
			return "carta";

		} else if (casuale < 0.66) {
			return "forbici";
		}

		return "sasso";
	}

	private static String chiediUmano() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Giochiamo!");
		System.out.println("Scegli tra: Sasso, Carta o Forbice!");

		return scanner.next();
	}

}