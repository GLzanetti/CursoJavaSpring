package OO.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Caneta", 2.50);
		Produto p2 = new Produto("Caderno", 10.00);
		Produto p3 = new Produto("Branquinho", 5.69);
		Produto p4 = new Produto("Canetão", 6.90);
		Produto p5 = new Produto("Apagador", 8.49);
		Produto p6 = new Produto("Borracha", 3.80);
		
		Item i1 = new Item(p1, 3);
		Item i2 = new Item(p2, 1);
		Item i3 = new Item(p3, 2);
		Item i4 = new Item(p4, 6);
		Item i5 = new Item(p5, 2);
		Item i6 = new Item(p6, 8);
		
		Compra c1 = new Compra();
		c1.addItem(i1);
		c1.addItem(i2);
		c1.addItem(i3);
		
		Compra c2 = new Compra();
		c2.addItem(i6);
		c2.addItem(i5);
		c2.addItem(i4);
		
		Compra c3 = new Compra();
		c3.addItem(i3);
		c3.addItem(i4);
		c3.addItem(i2);
		c3.addItem(i6);

		Compra c4 = new Compra();
		c4.addItem(i2);
		c4.addItem(i1);
		
		System.out.printf("%.2d",c1.getValorTotal());
		System.out.println(c2.getValorTotal());
		System.out.println(c3.getValorTotal());
		System.out.println(c4.getValorTotal());
		
		Cliente cliente1 = new Cliente("Gabriel");
		Cliente cliente2 = new Cliente("Cida");
		
		cliente1.addCompra(c1);
		cliente1.addCompra(c2);
		
		cliente2.addCompra(c3);
		cliente2.addCompra(c4);
		
		System.out.println("O valor total da compra de " + cliente1.nome + " é R$"+ cliente1.getValorTotal());
		System.out.println("O valor total da compra de " + cliente2.nome + " é R$"+ cliente2.getValorTotal());
	}
}
