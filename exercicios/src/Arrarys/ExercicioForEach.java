package Arrarys;

import java.util.Arrays;

public class ExercicioForEach {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		//para transformar um array em uma string = Arrays.toString(notasAlunoA)
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println();
		
		//para percorrer um array
		double totalAlunoA = 0;
		for(double notas: notasAlunoA) {
			System.out.print(notas+" ");
			totalAlunoA += notas;
		}
		System.out.println();
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		
		System.out.println();
		double totalAlunoB = 0;
		for (double notas: notasAlunoB) {
				System.out.print(notas+" ");
				totalAlunoB += notas;
		}
		System.out.println();
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
