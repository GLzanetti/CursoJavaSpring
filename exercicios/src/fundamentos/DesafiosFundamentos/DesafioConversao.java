package fundamentos.DesafiosFundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Média Salarial de funcionério.");
		System.out.print("Digite o primeiro salário: ");
		String s1 = entrada.nextLine();
		System.out.print("Digite o segundo salário: ");
		String s2 = entrada.nextLine();
		System.out.print("Digite o terceiro salário: ");
		String s3 = entrada.nextLine();
		entrada.close();
		//Seria possível tambem colocar o replace junto do entrade.nextLine();
		Double salario1 = Double.parseDouble(s1.replace(",", "."));
		Double salario2 = Double.parseDouble(s2.replace(",", "."));
		Double salario3 = Double.parseDouble(s3.replace(",", "."));
		Double media = ((salario1 + salario2 + salario3)/3);
		System.out.println("A média salarial de funcionário é: " + media.toString().replace(".", ","));
		
	}
}