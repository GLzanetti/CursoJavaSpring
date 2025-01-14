package OO.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> itens = new ArrayList<Item>();
	
	void addItem(Item item) {
		this.itens.add(item);
	}
	
	double getValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
