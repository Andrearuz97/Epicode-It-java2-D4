package MainCatalogo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import mioCatalogo.Customer;
import mioCatalogo.Order;
import mioCatalogo.Product;
import mioCatalogoExercises.Esercizio1;
import mioCatalogoExercises.Esercizio2;
import mioCatalogoExercises.Esercizio3;
import mioCatalogoExercises.Esercizio4;

public class Main {
	public static void main(String[] args) {
		List<Product> catalogoProdotti = new ArrayList<>();
		catalogoProdotti.add(new Product(1, "Libro 1", "Books", 120.0));
		catalogoProdotti.add(new Product(2, "Libro 2", "Books", 90.0));
		catalogoProdotti.add(new Product(3, "Penna", "Stationery", 5.0));
		catalogoProdotti.add(new Product(4, "Giochino", "Baby", 50.0));
		catalogoProdotti.add(new Product(5, "Sonaglio", "Baby", 50.0));

		List<Order> ordini = new ArrayList<>();
		Customer customer1 = new Customer(1, "Cliente 1", 2);
		Customer customer2 = new Customer(2, "Cliente 2", 3);

		List<Product> prodottiOrdine1 = new ArrayList<>();
		prodottiOrdine1.add(catalogoProdotti.get(0));
		prodottiOrdine1.add(catalogoProdotti.get(2));

		List<Product> prodottiOrdine2 = new ArrayList<>();
		prodottiOrdine2.add(catalogoProdotti.get(1));
		prodottiOrdine2.add(catalogoProdotti.get(3));

		ordini.add(new Order(1, "In corso", LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 20), prodottiOrdine1,
				customer1));
		ordini.add(new Order(2, "Consegnato", LocalDate.of(2021, 2, 1), LocalDate.of(2021, 2, 5), prodottiOrdine2,
				customer2));

		Esercizio1 esercizio1 = new Esercizio1();
		List<Product> risultato1 = esercizio1.filtraggioPerCategoriaEPrezzo(catalogoProdotti);
		System.out.println("Esercizio 1:");
		System.out.println(risultato1);

		Esercizio2 esercizio2 = new Esercizio2();
		List<Order> risultato2 = esercizio2.filtraggioOrdiniPerCategoria(ordini, "Baby");
		System.out.println("Esercizio 2:");
		System.out.println(risultato2);

		Esercizio3 esercizio3 = new Esercizio3();
		List<Product> risultato3 = esercizio3.applicaScontoCategoria(catalogoProdotti, "Boys", 0.1);
		System.out.println("Esercizio 3:");
		System.out.println(risultato3);

		Esercizio4 esercizio4 = new Esercizio4();
		List<Product> risultato4 = esercizio4.filtraggioProdottiPerClienteEPeriodo(ordini, 2, LocalDate.of(2021, 2, 1),
				LocalDate.of(2021, 4, 1));
		System.out.println("Esercizio 4:");
		System.out.println(risultato4);
	}
}
