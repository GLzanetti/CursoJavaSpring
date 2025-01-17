package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 35.00;
		
		Produto produto = new Produto("Caderno", 50.59, 0.05);
		System.out.println(isCaro.test(produto));
	}
}	