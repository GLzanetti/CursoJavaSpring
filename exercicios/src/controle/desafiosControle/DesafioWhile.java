package controle.desafiosControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double notas = 0;
		double total = 0;
		int validas = 0;
		int sair = 0;
		double media;
		while(sair != -1) {
			System.out.println("Digite uma nota: ");
			notas = entrada.nextDouble();
			while(notas > 10 || notas < 0) {
				if(notas > 10 || notas < 0) {
					System.out.println("Digite uma nota válida: ");
					notas = entrada.nextDouble();
				}
			}
			total += notas;
			validas++;
			System.out.println("Deseja sair? ");
			sair = entrada.nextInt();
		}
		media = total/validas;
		System.out.println(media);
		entrada.close();
	}
}

/*	Correção 
 *	
 *		Scanner entrada = new Scanner(System.in);
		double notas = 0;
		double total = 0;
 * 		int validas = 0;
 * 		double media;
		while(notas != -1) {
			System.out.println("Digite uma nota (ou -1 para sair): ");
			notas = entrada.nextDouble();
			
		 	if(notas <=10 && notas>= 0){
 * 				total += notas;
				validas++;
			} else if(notas != -1){
				System.out.println("Nota inválida");
			}
		}
		media = total/validas;
		System.out.println(media);

		entrada.close();
 * 
 * 
 */
 