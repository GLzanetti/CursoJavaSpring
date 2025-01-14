package controle.desafiosControle;

import java.util.Scanner;

public class NPrimos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número para verificar se ele é primo: ");
		double primo = entrada.nextDouble();
		if(primo == 2 || primo == 3 || primo == 5 || primo == 7) {
			System.out.printf("O número %.1f é Primo", primo);
		}else if(primo%2 == 0 || primo%3 == 0 || primo%5 == 0 || primo%7 == 0) {
			System.out.printf("O número %.1f NÃO é Primo", primo);
		} else {
			System.out.printf("O número %.1f é Primo", primo);
		}
		
		entrada.close();
	}
}
