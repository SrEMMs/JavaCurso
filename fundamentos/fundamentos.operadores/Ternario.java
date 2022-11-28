public class Ternario {
    public static void main(String[] args) {
        double media = 9.5;
        String resultadoRecuperacao = media >= 5.0 ? "Em Recuperação." : "Reprovado";
        String resultado = media >= 7.0 ? "Aprovado." : resultadoRecuperacao;
        
        System.out.println("O aluno está: " + resultado);
    }
}
