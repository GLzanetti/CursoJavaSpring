package fundamentos;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultado = media >= 7.0 ? "Aprovado" : "Recuperação";
		
		System.out.println(resultado);
		
		double nota = 9.5;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota>=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado2 = temDesconto ? "Sim" : "Não";
		System.out.printf("Tem desconto? %s", resultado2);
	}

}
