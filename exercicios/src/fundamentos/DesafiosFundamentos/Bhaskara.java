package fundamentos.DesafiosFundamentos;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		int a = entrada.nextInt();
		System.out.println("Digite o valor de b: ");
		int b = entrada.nextInt();
		System.out.println("Digite o valor de c: ");
		int c = entrada.nextInt();
		
		int delta = (int) Math.pow(b, 2) - (4*a*c);
		
		System.out.println("O valor de delta com esses números = " + delta);
		
		entrada.close();
	}
}
