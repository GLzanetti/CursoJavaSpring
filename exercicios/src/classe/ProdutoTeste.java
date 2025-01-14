package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
//		p1.nome = "Notebook";
		p1.preco = 4395.89;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 4.50;
		
		Produto.desconto = 0.25;		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.println(p1.nome);
		System.out.println("R$" + p1.preco);
		System.out.printf("R$%.2f\n",precoFinal1);
		System.out.println(p2.nome);
		System.out.println("R$" + p2.preco);
		System.out.printf("R$%.2f", precoFinal2);
	}
}
