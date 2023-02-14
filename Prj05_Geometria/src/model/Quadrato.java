package model;

public class Quadrato extends Rettangolo {

	Segmento lato;
	
	public Quadrato(Segmento lato) {
		//Va a richiamare il costruttore del genitore.
		//Deve essere la prima istruzione fornita al costruttore del figlio.
		super(lato, lato);
		this.nome = "Quadrato";
		this.lato = lato;
	}

	@Override //<--- annotazione diretta al compilatore: lo obbliga a controllare l'esistenza del metodo nella superclasse
	public double calcolaSuperficie() {
		
		//System.out.println("Ho usato il calcolo del quadrato");
		return Math.pow(this.base.lunghezza, 2);
	}

//	@Override
//	public String toString() {
//		
//		return super.toString();
//	}
}
