package Arrarys;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
 public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Quantos alunos são? ");
	int qtAlunos = entrada.nextInt();
	
	System.out.print("Quantas notas por aluno? ");
	int qtNotas = entrada.nextInt();
	
	double[][] notas = new double[qtAlunos][qtNotas];
	
	double total = 0;
	for(int a = 0; a<notas.length; a++) {
		for(int n = 0; n<notas[a].length; n++) {
			System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
			notas[a][n] = entrada.nextDouble();
			total += notas[a][n];
		}
	}
	double media = total/(qtAlunos * qtNotas);
	System.out.println("A média da turma é : " + media);
	
	for(double[] notasAlunos : notas) {
		System.out.println(Arrays.toString(notasAlunos));
	}
	entrada.close();
}
}
