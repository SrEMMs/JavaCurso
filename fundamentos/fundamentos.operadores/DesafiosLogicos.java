public class DesafiosLogicos {
    public static void main(String[] args) {
        
        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTv50 = trabalho1 && trabalho2; 
        boolean comprouTv32 = trabalho1 ^ trabalho2;

        boolean comprouSorvete = trabalho1 || trabalho2;
        boolean maisSaudavel = !comprouSorvete;

        //\" faz com que o programa exiba as ""
        System.out.println("Comprou TV 50\"? " + comprouTv50);
        System.out.println("Comprou TV 32\"? " + comprouTv32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);
        System.out.println("Mais Saudável? " + maisSaudavel);


    }
}
