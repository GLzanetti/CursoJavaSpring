package controle.desafiosControle;

import java.util.Scanner;

public class MaiorNúmero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int salvar = 0;
		for(int i = 0; i<=10; ++i) {
			System.out.println("Digite um sequência de números que te direi qual deles é o maior: ");
			num = entrada.nextInt();
			if(num > salvar) {
				salvar = num;
			}
		}
		System.out.println("O maior número digitado foi: " + salvar);
		entrada.close();
		
	}
}
