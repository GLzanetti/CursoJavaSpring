package OO.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void addCompra(Compra compra) {
		compras.add(compra);
	}
	
	double getValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.getValorTotal();
		}
		return total;
	}
}
