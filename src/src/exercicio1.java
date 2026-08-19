public class exercicio1 {
    public static void main(String[] args) {
        double ps = 8.5;
        double tcc = 6.0;
        double av1 = 4.5;
        double av2 = 5.75;

        double mediaFinal = (ps * 0.5) + (tcc * 0.3) + ((av1 + av2) /2) * 0.2;

        if (mediaFinal >= 7.0) {
            System.out.println("Aluno aprovado! :" + mediaFinal);
        } else {
            System.out.println("Aluno reprovado! :" + mediaFinal);
        }
    }
}
