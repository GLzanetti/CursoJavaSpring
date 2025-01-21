package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bianca", 5.5);
		Aluno a3 = new Aluno("Gabriel", 6.0);
		Aluno a4 = new Aluno("Daniel", 10.0);
		Aluno a5 = new Aluno("Carol", 8.2);
		Aluno a6 = new Aluno("Pedro", 9.7);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> aprovacao = a -> "Parabéns " + a.nome + "! Você foi aprovado!";
		
		alunos.stream()
		.filter(aprovado)
		.map(aprovacao)
		.forEach(System.out::println);
	}
}
