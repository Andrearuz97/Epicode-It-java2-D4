package mioCatalogoExercises;

import java.util.List;
import java.util.stream.Collectors;

import mioCatalogo.Product;

public class Esercizio1 {
	public List<Product> filtraggioPerCategoriaEPrezzo(List<Product> catalogoProdotti) {
		return catalogoProdotti.stream()
				.filter(prodotto -> prodotto.getCategory().equals("Books") && prodotto.getPrice() > 100)
				.collect(Collectors.toList());
	}
}
