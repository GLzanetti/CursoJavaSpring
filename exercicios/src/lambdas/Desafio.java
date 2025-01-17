package lambdas;

import java.util.function.Function;

public class Desafio {
	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> valor = prod -> prod.preco * (1-prod.desconto);
		double valorFinal = valor.apply(p);
		Function<Double, Double> imposto = valorComImposto -> valorFinal >= 2500 ? valorFinal+(valorFinal*0.085) : valorFinal;
		Function<Double, Double> frete = valorComFrete -> imposto.apply(valorFinal) >= 3000 ? imposto.apply(valorFinal) + 100 : imposto.apply(valorFinal) + 50;
		System.out.println(String.format("O produto %s custa R$%.2f", p.nome,frete.apply(valorFinal)));
		
		

		/*
		 * 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8.5%)/ < 2500 (Insento)
		 * 3. Frete: >= 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixa duas casas decimais
		 * 5. Formatar: R$1234,56
		 * 
		 * 					Resolução do Professor
		 * 
		 * Function<Produto, Double> valorFinal = 
		 * 		produto -> produtop.preco * (1 - produto.desconto);
		 * UnaryOperator<Double> impostoMunicipal = 
		 * 		preco -> preco >= 2500 ? preco * 1.085 : preco;
		 * UnaryOperator<Double> frete =
		 * 		preco -> preco >= 3000 ? preco + 100 : preco + 50;
		 * UnaryOperator<Double> arredondar =
		 * 		preco -> Double.parseDouble(String.format("%.2f", preco));
		 * Function<Double, String> formatar =
		 * 		preco -> ("R$" + preco).replace(".", ",");
		 * 
		 * String preco = precoFinal
		 * 			.andThen(impostoMunicipal)
		 * 			.andThen(frete)
		 * 			.andThen(arredondar)
		 * 			.andThen(formatar)
		 * 			.apply(p);
		 * System.out.println("O preço final é " + preco);
		 * 
		 */
	}
}