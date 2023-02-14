package model;
/* Possiamo dichiarare una classe astratta anche senza metodi astratti. Ma se abbiamo anche solo
 * un metodo astratto, allora la classe dev'essere per forza dichiarata astratta */
public abstract class FiguraGeometrica {
	//Parte concreta
	String nome;
	
	public FiguraGeometrica(String nome) {
		//System.out.println("Ho costruito una figura astratta");
		this.nome = nome;
	}

	double superficie;
	double perimetro;

	@Override
	public String toString() {
		return "FiguraGeometrica [nome: " + nome + ", superficie: " + superficie + ", perimetro: " + perimetro + "]";
	}

	//Parte astratta
	abstract double calcolaSuperficie();
}
