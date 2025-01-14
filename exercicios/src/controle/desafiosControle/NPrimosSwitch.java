package controle.desafiosControle;

import java.util.Scanner;

public class NPrimosSwitch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número para saber se ele é primo: ");
		int num = entrada.nextInt();
		int caso;
		if(num == 2 || num == 3 || num == 5 || num == 7) {
			caso = 1;
		}else if(num%2 == 0 || num%3 == 0 || num%5 == 0 || num%7 == 0) {
			caso = 2;
		} else {
			caso = 1;
		}
		switch(caso) {
		case 1:
			System.out.printf("O número %d Primo",num);
			break;
		case 2:
			System.out.printf("O número %d Não é primo",num);
			break;
		}
		entrada.close();
	}
}
