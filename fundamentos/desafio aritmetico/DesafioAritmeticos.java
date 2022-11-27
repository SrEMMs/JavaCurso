public class DesafioAritmeticos {
    public static void main(String[] args) {
        
        int op1 = (int) (6 * (3 + 2));
        int op2 = (int) Math.pow(op1, 2);
        int op3 = op2 / ( 3 * 2);
        
        int op4 = ((1 - 5) * (2 - 7)) / 2;
        int op5 = (int) Math.pow(op4, 2);
        
        int op6 = op3 - op5;
        int op7 = (int) Math.pow(op6, 3);
        
        int op8 = (int) Math.pow(10, 3);

        int resultado = op7 / op8;
        System.out.println(resultado);
    }
}
