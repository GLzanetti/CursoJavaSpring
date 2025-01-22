package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		//Cuidado ao aplicar valores primitivos para valores com Wrapper
		int total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);
		
		/*
		 * Quando utilizado um parallelStream()
		 * o valor inicial do reduce é aplicado 
		 * individualmente para cada N na lista
		 */
		Integer total2 = nums.parallelStream().reduce(100, soma);		
		System.out.println(total2);
		
		/*
		 * Por isso nesse caso colocando um
		 * valor inicial, é melhor utilizar o stream
		 * ja que as operações serão feitas em sequência
		 */
		Integer total3 = nums.stream().reduce(0, soma);		
		System.out.println(total3);
		
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
	}
}
