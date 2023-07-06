package mioCatalogoExercises;

import java.util.List;
import java.util.stream.Collectors;

import mioCatalogo.Order;

public class Esercizio2 {
	public List<Order> filtraggioOrdiniPerCategoria(List<Order> ordini, String categoria) {
		return ordini.stream()
				.filter(ordine -> ordine.getProducts().stream()
						.anyMatch(prodotto -> prodotto.getCategory().equalsIgnoreCase(categoria)))
				.collect(Collectors.toList());
	}
}
