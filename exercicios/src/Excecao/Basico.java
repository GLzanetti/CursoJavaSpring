package Excecao;

public class Basico {
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeAluno(a1);		
		} catch(Exception excecao) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do Usuário");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fim");
	}
	
	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
		
	}
}
