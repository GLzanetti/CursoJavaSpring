package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String sair = "";
		do {
			System.out.println("Voce precisa falar as palavras magicas...");
			System.out.println("Voce quer sair?");
			sair = entrada.nextLine();
		} while(!sair.equalsIgnoreCase("por favor"));

		entrada.close();
	}
}
