package OO.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Pedro");
		Aluno a3 = new Aluno("Maria");
		
		Curso c1 = new Curso("Java Completo");
		Curso c2 = new Curso("Wab 2024");
		Curso c3 = new Curso("Reactive Native");
		
		c1.adicionarAluno(a1);
		c1.adicionarAluno(a2);
		
		c2.adicionarAluno(a1);
		c2.adicionarAluno(a3);
		
		a1.adicionarCurso(c3);
		a2.adicionarCurso(c3);
		a3.adicionarCurso(c3);
		
		for(Aluno aluno: c1.alunos) {
			System.out.println("Curso 1: " + aluno.nome);
		}
		
		for(Aluno aluno: c2.alunos) {
			System.out.println("Curso 2: " + aluno.nome);
		}
		
		for(Aluno aluno: c3.alunos) {
			System.out.println("Curso 3: " + aluno.nome);
		}
	}
}
