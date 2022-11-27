public class Logicos {
    public static void main(String[] args) {
        
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        System.out.println("Tabela verdade E(AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        //comentado para tirar os codigos morto ja que tem false no inicio assim validando a sentença
        //System.out.println(false && true);
        //System.out.println(false && false);
        System.out.println("====================");


        System.out.println("Tabela verdade OU(OR)");
        //comentado para tirar os codigos mortos ja que tem TRUE no incio assim validando a sentença
        //System.out.println(true || true);
        //System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println("====================");

        System.out.println("Tabela verdade OU Exclusivo(XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
    }
}
