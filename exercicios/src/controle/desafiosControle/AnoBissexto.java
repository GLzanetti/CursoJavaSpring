package controle.desafiosControle;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um ano para saber se ele é bissexto: ");
		int ano = entrada.nextInt();
		if(ano%4 == 0 && ano%100 != 0 || ano%400 == 0) {
			System.out.printf("%d é Bissexto", ano);
		} else {
			System.out.printf("%d não é Bissexto", ano);
		}

		entrada.close();
	}
}
