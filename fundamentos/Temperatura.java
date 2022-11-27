public class Temperatura {
	public static void main(String[] args) {
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		double f; //f = Fahrenheit
		double c; //c = Celcius
		
		f = 86;
		
		c = (f - AJUSTE) * FATOR;
		System.out.println(f + " graus Fahrenheit = " + c + " graus Celcius");
	}
}
