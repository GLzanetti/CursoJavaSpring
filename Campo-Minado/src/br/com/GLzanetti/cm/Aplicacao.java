package br.com.GLzanetti.cm;

import br.com.GLzanetti.cm.modelo.Tabuleiro;
import br.com.GLzanetti.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		
		Tabuleiro tabulerio = new Tabuleiro(10,10,6);
		new TabuleiroConsole(tabulerio);
		
		System.out.println(tabulerio);
	}
}
