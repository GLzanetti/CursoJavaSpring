package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
//		Set<String> lista = new HashSet<>();
//		TreeSet<String> lista = new TreeSet<>(); //Organização por ordem
		SortedSet<String> lista = new TreeSet<>();
		lista.add("Gabriel");
		lista.add("Breno");
		lista.add("Jonatas");
		lista.add("Lucas");
		
		for(String nome: lista) {
			System.out.println(nome);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(120);
		
		//nums.get(3); Não é possível utilizar índice
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
