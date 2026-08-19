import java.util.Scanner;

public class ternario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantidade de laranjas: ");
        double laranjas = entrada.nextDouble();

        System.out.println("A forma de pagamento é PIX: ");
        boolean pix = entrada.nextBoolean();

        // Operador ternário de if/else

        double valor = laranjas < 10 ? 2.5 : 2;
        double desconto = pix == true ? .9 : 1;

        double valorFinal = valor * laranjas * desconto;

        System.out.println("Valor: " + valorFinal);
    }
}
