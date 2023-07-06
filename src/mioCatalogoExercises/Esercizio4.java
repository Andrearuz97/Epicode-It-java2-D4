package mioCatalogoExercises;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import mioCatalogo.Order;
import mioCatalogo.Product;

public class Esercizio4 {
	public List<Product> filtraggioProdottiPerClienteEPeriodo(List<Order> ordini, int livello, LocalDate dataInizio,
			LocalDate dataFine) {
		return ordini.stream()
				.filter(ordine -> ordine.getCustomer().getTier() == livello && ordine.getOrderDate().isAfter(dataInizio)
						&& ordine.getOrderDate().isBefore(dataFine))
				.flatMap(ordine -> ordine.getProducts().stream()).collect(Collectors.toList());
	}
}
