package fundamentos.DesafiosFundamentos;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite qual sua temperatura atual em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		double celsius = (fahrenheit - 32) * 5.0/9.0;
		System.out.printf("Sua temperatura atual em Celsius = %.2f °C", celsius);
		entrada.close();
	}
}
