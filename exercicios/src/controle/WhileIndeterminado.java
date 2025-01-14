package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String sair = "";
		System.out.println("Quando quiser sair digite: sair/Sair");
		while(!sair.equalsIgnoreCase("sair")){
			System.out.print("Digite qualquer palavra: ");
			sair = entrada.next();
		}
		entrada.close();
	}
}
