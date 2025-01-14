package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		String s = "Texto"; //Possui notação ponto
		s.toUpperCase();
		
		//Wrappers são a versão objeto dos tipos primitivos!
		int a = 123; //Não possui notação ponto
		System.out.println(a);
	}
}
