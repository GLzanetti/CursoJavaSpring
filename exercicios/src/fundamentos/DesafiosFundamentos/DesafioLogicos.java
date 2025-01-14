package fundamentos.DesafiosFundamentos;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean terca = true;
		boolean quinta = true;
		
		boolean tv50 = terca && quinta;
		System.out.println("\"Comprou Tv 50\"? " + tv50);
		boolean tv32 = terca ^ quinta;
		System.out.println("\"Comprou Tv 32\"? " + tv32);
		boolean sorvete = terca || quinta;
		System.out.println("\"Comprou sorvete\"? " + sorvete);
		boolean saudavel = !sorvete;
		System.out.println("Mais saudável? " + saudavel);
	}
}
