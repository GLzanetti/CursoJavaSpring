package fundamentos.DesafiosFundamentos;

import java.util.Scanner;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual a sua temperatura atual em Celsius: ");
		double celsius = entrada.nextDouble();
		double fahrenheit = (celsius * (9.0/5.0)) + 32;
		System.out.printf("Sua temperatura atual em Fahrenheit é = %.2f °F", fahrenheit);
		
		entrada.close();
	}
}
