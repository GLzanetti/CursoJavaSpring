package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informação do Funcionario
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; //caso o valor passe do limite de int é necessario colocar a letra L no final do número
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_891_312_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // true
		
		//Tipo caractere
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}	
