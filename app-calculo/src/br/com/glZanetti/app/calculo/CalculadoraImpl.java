package br.com.glZanetti.app.calculo;

import br.com.glZanetti.app.Calculadora;
import br.com.glZanetti.app.calculo.interno.OperacoesAritmeticas;
import br.com.glZanetti.app.logging.Logger;

public class CalculadoraImpl implements Calculadora{
	
	private String id = "abc";
	
	private OperacoesAritmeticas op = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return op.soma(nums);
	}

	public String getId() {
		return id;
	}
}
