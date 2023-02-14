package test;

import model.Punto;
import model.Segmento;

public class SegmentoTest {

	public static void main(String[] args) {
		
		Punto a = new Punto(3, 2);
		Punto b = new Punto(7, 2);
		Punto c = new Punto(3, 5);
		
		Segmento ab = new Segmento(a, b);
		Segmento ac = new Segmento(a, c);
		Segmento bc = new Segmento(b, c);
		
		System.out.println(ab);
		System.out.println(ac);
		System.out.println(bc);

	}

}
