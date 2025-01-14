package fundamentos.DesafiosFundamentos;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		//Math.pow(a , b); para potencias
		
		int a = (int) Math.pow(6*(3+2) , 2);
		int b = a / (3*2);
		int c = (1-5)*(2-7);
		int d = (int) Math.pow(c/2, 2);
		int e = (int) Math.pow(b - d, 3);
		int f = (int) Math.pow(10, 3);
		int g = e / f;
				
		System.out.println(g);
		
	}
}
