package model;

public class Dado {
	int facce;
	String colore;
	
	public Dado() {
		// TODO Auto-generated constructor stub
		this.facce = 6;
		this.colore = "bianco";
	}

	public Dado(int facce, String colore) {
		super();
		this.facce = facce;
		this.colore = colore;
	}
	
	public int lancia() {
		int casuale = 0;
		casuale = (int) (Math.random() * facce) + 1; //Non costruisce istanze/esemplari di Math.
		return casuale;
	}

	
}
