package controle.desafiosControle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o dia da semana: ");
		String dia = entrada.next().toLowerCase();
		
		//Pode ser feito tambem com a funcao .equalsIgnoreCase;
		if(dia.equals("domingo")) {
			System.out.println("Domingo = 1");
		} else if(dia.equals("segunda")) {
			System.out.println("Segunda = 2");
		} else if(dia.equals("segunda")) {
			System.out.println("Segunda = 2");
		} else if(dia.equals("terca")) {
			System.out.println("Terca = 3");
		} else if(dia.equals("quarta")) {
			System.out.println("Quarta = 4");
		} else if(dia.equals("quinta")) {
			System.out.println("Quinta = 5");
		} else if(dia.equals("sexta")) {
			System.out.println("Sexta = 6");
		} else if(dia.equals("sabado")) {
			System.out.println("Sabado = 7");
		} else {
			System.out.println("Dia inválido.");
		}
		
		entrada.close();
	}
}
