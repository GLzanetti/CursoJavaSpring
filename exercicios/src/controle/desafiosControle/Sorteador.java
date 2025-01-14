package controle.desafiosControle;

import java.util.Scanner;

public class Sorteador {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numAdivinhar = 53;
		System.out.println("Tente adivinhar o número");
		System.out.print("Digite o número que você ache que é: ");
		int num = entrada.nextInt();
		for(int i = 10; i>=0; --i) {	
			if (num == numAdivinhar) {
				System.out.println("Parabéns, você acertou o número em " + i +" tentativas");
				break;
			} else if(num != numAdivinhar) {
				if(num > numAdivinhar) {
					System.out.printf("O número %d é maior que o número sorteado, você possui %d tentativas",num,i);
				} else {
					System.out.printf("O número %d é menor que o número sorteado, você possui %d tentativas",num,i);
				}
			}
			System.out.print("\nDigite o número que você ache que é: ");
			num = entrada.nextInt();
		}
		entrada.close();
	}
}
