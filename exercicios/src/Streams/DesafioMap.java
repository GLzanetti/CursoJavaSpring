package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9);
		Function<Integer, String> binario = n -> Integer.toBinaryString(n);
		UnaryOperator<String> invertido = n -> {
			StringBuilder sb = new StringBuilder(n);
			return sb.reverse().toString();
		};
		Function<String, Integer> numDecimal = (String n) -> Integer.parseInt(n, 2);
		
		nums.stream().map(binario).forEach(System.out::println);
		nums.stream().map(binario).map(invertido).forEach(System.out::println);		
		nums.stream().map(binario).map(invertido).map(numDecimal).forEach(System.out::println);
		
		
		
		
		/*
	.	 * 1. Número para string binária... 6 => "110"
		 * 2. Reverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => "3"
		 */
		
		/*
		 *       Reposta do Professor
		 *       
		 * UnaryOperator<String> invertido = s -> new StringBuilder(s).reverse().toString();
		 * Function<String, Integer> numDecimal = s -> Integer.parseInt(s, 2);
		 * 
		 * nums.stream().map(Integer::toBinaryString).map(invertido).map(numDecimal).forEach(System.out::println);
		 */
	}
}
