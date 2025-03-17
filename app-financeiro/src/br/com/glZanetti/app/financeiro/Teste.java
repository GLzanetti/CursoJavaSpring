package br.com.glZanetti.app.financeiro;

import java.util.ServiceLoader;

import br.com.glZanetti.app.Calculadora;

public class Teste {
	public static void main(String[] args) {
		
		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get();
		System.out.println(calc.soma(2,3,4));
		
//		OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();
//		System.out.println(opAritmeticas.soma(5,6,7));
		
//		try {
//			Field fieldId = CalculadoraImpl.class.getDeclaredFields()[0];
//			fieldId.setAccessible(true);
//			fieldId.set(calc, "def");
//			
//			System.out.println(calc.getId());
//			
//			fieldId.setAccessible(false);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
