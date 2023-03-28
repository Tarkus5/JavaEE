package advanced;

import java.util.List;

public class TestCartoni {

	public static void main(String[] args) {

		CollezioneCartoni ctrl = new CollezioneCartoni();
		
		ctrl.mettiIlContenutoDelFileInUnaLista();
		
		List<Cartone> cartoniFiltrati = ctrl
		.dammiTuttiICartoniCheHaiNellaLista()
		.stream()
		.sorted((c1, c2) -> Double.compare(c2.getRating(), c1.getRating()))
		.filter(cartone -> cartone.getRating() > 8.9)
//		.forEach(cartone -> System.out.println(cartone));
		.toList()
		;
		
		System.out.println(cartoniFiltrati.size());
		
		ctrl.scriviUnFileDaUnaLista(cartoniFiltrati);
		
		
		
	}

}
