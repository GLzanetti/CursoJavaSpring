package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		//Tipos primitivos não tem o operador '.'
		String s = "Bom dia x";
		
		s = s.replace("x", "y");
		s = s.toUpperCase();
		s = s.concat(" !!!");
		System.out.println(s);
		
		String x = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
		/*String x = "Bom dia X"
		 * .replace("X", "Gui")
		 * .toUpperCase()
		 * .concat("!!!");
		 * podemos fazer de diferentes maneiras com o mesmo resultado*/
		System.out.println(x);
		
		
	}
}
