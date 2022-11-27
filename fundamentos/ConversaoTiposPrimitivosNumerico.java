
public class ConversaoTiposPrimitivosNumerico {
    public static void main(String[] args) {
		
		//Conversão Implicita
		double a = 1.123456789999999;
		System.out.println(a);
		
		//Conversão Explicita (CAST)
		float b = (float)1.123456789999999;
		System.out.println(b);
		
		//A conversão vai fazer voltas, voltar no inicio 128 = -128; 129 = -127
		int c = 129;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
	}
    
}