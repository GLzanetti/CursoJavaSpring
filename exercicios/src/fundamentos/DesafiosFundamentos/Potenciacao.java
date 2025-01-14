package fundamentos.DesafiosFundamentos;

import java.util.Scanner;

public class Potenciacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número desejado: ");
		double num = entrada.nextDouble();
		System.out.print("Informe em quanto ele será elevado: ");
		double expoente = entrada.nextDouble();
		double resultado = Math.pow(num, expoente);
		
		System.out.printf("%.1f ^ %.1f = %.1f", num, expoente, resultado);
		
		
		entrada.close();
	}
}
