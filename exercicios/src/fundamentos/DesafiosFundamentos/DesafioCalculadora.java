package fundamentos.DesafiosFundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		//+ - * / %
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		Double n1 = entrada.nextDouble();
		System.out.print("Digite um segundo número: ");
		Double n2 = entrada.nextDouble();
		System.out.print("Qual operação voce deseja(+, -, *, / e %): ");
		String operacao = entrada.next();
		entrada.close();	
		double resultado = "+".equals(operacao)? n1+n2 : 0;
		resultado = "-".equals(operacao)? n1-n2 : resultado;
		resultado = "*".equals(operacao)? n1*n2 : resultado;
		resultado = "/".equals(operacao)? n1/n2 : resultado;
		resultado = "%".equals(operacao)? n1%n2 : resultado;
		System.out.printf("%.2f %s %.2f = %.2f", n1, operacao, n2, resultado);
	}
}
