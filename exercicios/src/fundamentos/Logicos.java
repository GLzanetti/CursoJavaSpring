package fundamentos;

public class Logicos {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Tabela &&
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("\n");
		
		//Tabela ||
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("\n");
		
		//Tabela ^
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		System.out.println("\n");
		
		//Tabela ! e !!
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!!true);
		System.out.println(!!false);
	}
}
