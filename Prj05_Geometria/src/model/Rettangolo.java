package model;


public class Rettangolo extends FiguraGeometrica{
	Segmento base, altezza;
	//double perimetro;
	//double superficie;

	public Rettangolo(Segmento base, Segmento altezza) {
		super("Rettangolo");
		this.base = base;
		this.altezza = altezza;
		this.perimetro = this.calcolaPerimetro();
		this.superficie = this.calcolaSuperficie();
	}
	
	public double calcolaPerimetro() {
		return 2 * (base.lunghezza + altezza.lunghezza);
	}
	
	public double calcolaSuperficie() {
		//System.out.println("Ho usato il calcolo del rettangolo");
		return (base.lunghezza * altezza.lunghezza);
	}

//	@Override
//	public String toString() {
//		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", perimetro=" + perimetro + ", superficie="
//				+ superficie + "]";
//	}
	
	
	
	
}
