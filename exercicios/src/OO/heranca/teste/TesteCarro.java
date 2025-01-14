package OO.heranca.teste;

import OO.heranca.desafio.Fusca;
import OO.heranca.desafio.Lamborgini;

public class TesteCarro {
	public static void main(String[] args) {
		Lamborgini l1 = new Lamborgini();
		
		Fusca f1 = new Fusca();
		
		System.out.println(l1.velocidadeDoAr());
		l1.ligarTurbo();
		l1.ligarAr();
		l1.acelerar();
		l1.acelerar();
		System.out.println(l1.velocidadeAtual);
		l1.desligarturbo();
		l1.desligarAr();
		l1.acelerar();

		System.out.println(l1.velocidadeAtual);
		
		l1.frear();
		l1.frear();
		l1.frear();
		System.out.println(l1.velocidadeAtual);
		
		f1.acelerar();
		System.out.println(f1.velocidadeAtual);
		f1.acelerar();
		System.out.println(f1.velocidadeAtual);
		f1.acelerar();
		System.out.println(f1.velocidadeAtual);
		f1.acelerar();
		System.out.println(f1.velocidadeAtual);
		
		f1.frear();
		f1.frear();
		f1.frear();
		f1.frear();
		System.out.println(f1.velocidadeAtual);
	}
}
