package controle.desafiosControle;

import java.util.Scanner;

public class NumeroParImpar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 10: ");
		int num = entrada.nextInt();
		if(num > 10 || num < 0) {
			System.out.println("Número inválido!");
		} else if(num %2 == 0) {
			System.out.println("O número " + num + " é Par"); 
		} else {
			System.out.println("O número " + num + " é Ímpar");
		}

		entrada.close();
	}
}
