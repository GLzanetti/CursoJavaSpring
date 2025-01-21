package Streams.DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class AbaDestaque {
	public static void main(String[] args) {
		
		Produtos p1 = new Produtos("Razer Kraken v3", 269.90, 0.30, 20.00);
		Produtos p2 = new Produtos("GPro X superlight v2", 1599.89, 0.45, 50.00);
		Produtos p3 = new Produtos("Razer Hunstman X mini v2", 2500.00, 0.25, 00.00);
		Produtos p4 = new Produtos("Razer Deathadder", 106.99, 0.10, 10.00);
		Produtos p5 = new Produtos("Razer Viper v3", 1675.50, 0.10, 50.00);
		Produtos p6 = new Produtos("FinalMouse v2", 1999.99, 0.15, 00.00);
		
		List<Produtos> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		Predicate<Produtos> desconto = d -> d.desconto >= 0.20;
		Predicate<Produtos> frete = f -> f.frete <= 50.00;
		Function<Produtos, String> destaques = d -> d.nome + "!!! Produto incrivel com muito desconto e frete baixo";
		
		produtos.stream().filter(desconto).filter(frete).map(destaques).forEach(System.out::println);
	}
}
