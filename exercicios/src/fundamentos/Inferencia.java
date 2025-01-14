package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		//é possíuvel definir variáveis igual em JS
		var b = 4.5;
		System.out.println(b);
		//porem não pode mudar o tipo de variável com o var
		//exemplo c = string, se mudar para c = double irá dar erro.
		var c = "Hello Word";
		System.out.println(c);
		c = "Outro Hello Word";
		System.out.println(c);
		
	}
}	
