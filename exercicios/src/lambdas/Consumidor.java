package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {

		Consumer<Produto> imprimir = 
				p -> System.out.println(p.nome + " = R$" + p.preco);
				
		Produto p1 = new Produto("Caneta", 5.34, 0.02);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Caderno", 34.34, 0.10);
		Produto p3 = new Produto("Lapis", 2.00, 0.02);
		Produto p4 = new Produto("Borracha", 3.50, 0.02);
		Produto p5 = new Produto("Estojo", 20.87, 0.10);
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.desconto));
		produtos.forEach(System.out::println);
	}
}