import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Byte 
		Byte b = 100;
		//Short
		Short s = 1000;
		//Int
		//Integer i = Integer.parseInt(entrada.next());
		Integer  i = 10000;
		//Long
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		//float
		Float f = 123.0F;
		System.out.println(f);
		
		//double
		Double d = 123.45678;
		System.out.println(d);
		
		//boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		//Char
		Character c = '#';
		System.out.println(c + "...");
		
		entrada.close();
	}
}
