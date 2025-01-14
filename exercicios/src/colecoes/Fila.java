package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); //Coloca na fila mesmo estando cheia
		fila.offer("Bia"); //Fila com tamanho determinado, retorna falso caso não consiga adicionar
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		 //Caso vazia
		System.out.println(fila.peek()); //retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); //retorna erro
		
		// fila.siz()
		// fila.clear()
		// fila.isEmpty()
		// fila.contains()
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // retorna nulo pq não tem mais ninguem na lista
		System.out.println(fila.remove()); // Caso vazia retorna erro
	}
}
