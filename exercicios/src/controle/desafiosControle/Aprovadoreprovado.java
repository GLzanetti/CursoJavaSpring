package controle.desafiosControle;

import java.util.Scanner;

public class Aprovadoreprovado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		double media = (nota1 + nota2)/2;
		if(media>=7) {
			System.out.printf("Sua média é %.2f, você foi Aprovado", media);
		} else if(media<7 && media >=4) {
			System.out.printf("Sua média é %.2f, você está de Recuperação", media);
		} else {
			System.out.printf("Sua média é %.2f, você está Reprovado", media);
		}

		entrada.close();
	}
}
