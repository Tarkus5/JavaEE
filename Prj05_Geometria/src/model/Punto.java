package model;

public class Punto {
	int x, y;
	
	//Inizializziamo il costruttore, il quale ci consentirà di impostare
	//la posizione dell'oggetto creato
	public Punto(int x, int y) {
		//Non usiamo il super perché richiamo la superclasse "Objects" la quale
		//viene sottointesa. Questo perché "Objects" ha un costruttore senza parametri
		this.x = x; //this = puntatore autoreferenziante
		this.y = y; 
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")"; //Questo ci dà la rappresentazione del sistema cartesiano (x,y)
	}
	
	
}
