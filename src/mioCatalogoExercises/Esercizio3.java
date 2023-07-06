package mioCatalogoExercises;

import java.util.List;
import java.util.stream.Collectors;

import mioCatalogo.Product;

public class Esercizio3 {
	public List<Product> applicaScontoCategoria(List<Product> catalogoProdotti, String categoria, double sconto) {
		return catalogoProdotti.stream().filter(prodotto -> prodotto.getCategory().equalsIgnoreCase(categoria))
				.map(prodotto -> {
					prodotto.setPrice(prodotto.getPrice() * (1 - sconto));
					return prodotto;
				}).collect(Collectors.toList());
	}
}
