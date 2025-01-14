package controle.desafiosControle;

import java.util.Scanner;

public class SomaDosPositivos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int soma = 0;
		do {
			System.out.print("Digite um número positivo: ");
			num = entrada.nextInt();
			if(num>=0) {
				soma = soma + num;
			} else {
				break;
			}
		}while(num>0);
		System.out.println("A soma dos números é: " + soma);
		entrada.close();
	}
}
