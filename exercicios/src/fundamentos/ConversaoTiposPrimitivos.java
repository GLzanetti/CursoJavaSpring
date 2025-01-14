package fundamentos;

public class ConversaoTiposPrimitivos {
	
	public static void main(String[] args) {
		
		double a = 1; //Conversão implícita para int
		System.out.println(a);
		
		float b = (float) 1.0; //Conversão explícita para float (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //Conversão explícita para byte (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; //Conversão explícita para int (CAST)
		System.out.println(f);
	}
}
