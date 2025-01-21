package Streams.DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		//Contratacão de Funcionários
		
		Candidatos c1 = new Candidatos("Gabriel", 23, "Masculino", 3);
		Candidatos c2 = new Candidatos("Matheus", 38, "Masculino", 8);
		Candidatos c3 = new Candidatos("Breno", 30, "Masculino", 5);
		Candidatos c4 = new Candidatos("Lucas", 25, "Masculino", 2);
		Candidatos c5 = new Candidatos("Guilherme", 28, "Masculino", 7);
		
		List<Candidatos> candidatos = Arrays.asList(c1, c2, c3, c4, c5);
		Predicate<Candidatos> idade = i -> i.idade >= 20;
		Predicate<Candidatos> experiencia = e -> e.experiencia >= 3;
		Function<Candidatos, String> aprovacao = a -> "Parabéns " + a.nome + "! Você foi aprovado em nosso processo seletivo";
		
		candidatos.stream()
		.filter(idade)
		.filter(experiencia)
		.map(aprovacao)
		.forEach(System.out::println);
	}
}
