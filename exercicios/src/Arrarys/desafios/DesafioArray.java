package Arrarys.desafios;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantas notas voce irá adicionar? ");
		int quantNotas = entrada.nextInt();
		double[] notas = new double[quantNotas];
		
		int contador = 1;
		for(int i = 0; i<notas.length; i++) {
			System.out.print("Digite a "+ contador + "° nota: ");
			notas[i] = entrada.nextDouble();
			contador++;
		}
		System.out.println(Arrays.toString(notas));
		entrada.close();
		
		double soma = 0;
		for(double media: notas) {
			soma += media;
		}
		soma = soma/notas.length;
		
		System.out.println("A média final do aluno é: "+soma);
	}
}
