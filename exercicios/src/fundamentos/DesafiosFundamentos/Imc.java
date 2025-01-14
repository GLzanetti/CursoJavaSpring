package fundamentos.DesafiosFundamentos;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe sua altura: ");
		double altura = entrada.nextDouble();
		System.out.print("Informe seu peso: ");
		double peso = entrada.nextDouble();
		double imc = peso/Math.pow(altura, 2);
		
		
		System.out.printf("%.2f/%.2f² = %.2f\n", peso, altura, imc);
		System.out.println("Seu IMC = " + imc);
		
		entrada.close();
				
	}
}
