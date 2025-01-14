package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(5.6);
//		AreaCirc.PI = 3.1415;//buscar a variavel dentro da classe e nao como uma instancia.
//      por ser uma constante PI nao pode mudar.
		//Aqui em baixo é uma instancia
		AreaCirc a2 = new AreaCirc();
		a2.raio = 10;
		System.out.println(a.area());
	}
}	
