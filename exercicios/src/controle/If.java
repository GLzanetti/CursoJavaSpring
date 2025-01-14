package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota do aluno: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota do aluno: ");
		double nota2 = entrada.nextDouble();
		System.out.print("Digite a terceira nota do aluno: ");
		double nota3 = entrada.nextDouble();
		
		double media = (nota1 + nota2 + nota3)/3;
		if(media >= 6) {
			System.out.printf("Sua média foi: %.2f\n", media);
			System.out.println("Aprovado");
		} else {
			if(media <= 5 || media > 3) {
				System.out.printf("Sua média foi: %.2f\n", media);
				System.out.println("Recuperação");
			} else {
					System.out.printf("Sua média foi: %.2f\n", media);
					System.out.println("Reprovado");
			}
		}
	
		entrada.close();
	}
}
