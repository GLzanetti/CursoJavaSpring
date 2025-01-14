package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		livros.add("O Pequeno Príncipe"); //adiciona mesmo com a pilha cheia
		livros.push("Don Quixote"); //caso a pilha esteja no limite não irá adicionar
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.pop());//caso vazio retorna erro
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.remove());//caso vazio retorna erro
		
		//livros.size()
		//livros.clear()
		//livros.contains()
		//livros.isEmpty()
	}
}
