import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(opcao + "-Pesquisar usuário");
                break;
            case 2:
                System.out.println(opcao + "- Cadastrar usuário");
                break;
            case 3:
                System.out.println(opcao + "- Abrir pedido");
                break;
            case 4:
                System.out.println(opcao + "- Fechar pedido");
                break;
            default:
                System.out.println(opcao + "- Fechar pedido");
        }
    }
}
