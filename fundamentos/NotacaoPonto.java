public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.toUpperCase();
		
		System.out.println(s);
		
		s = s.concat("!!!");
		s = s.replace("X", "Senhor");
		
		System.out.println(s);
		
		String x ="Erick".toUpperCase();
		System.out.println(x);
		System.out.println("Erick".toLowerCase());
		
		String y = "Bom Dia X".
				replace("X", "Erick").
				toUpperCase().
				concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador "."
		//int a =;
		//a. está errado
	}
}
