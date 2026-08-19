import java.sql.SQLOutput;

public class frase {
    public static void main(String[] args) {
        String frase;

        {
            frase = "Aprendi o conceito sobre escopo de variáveis em Java: ";
            {
                String fraseInterna = "Os blocos mais internos conseguem enxergar as variáveis declaradas ";
                frase = frase + fraseInterna;
                {
                    fraseInterna = ", portanto não podemos declarar outra variável com o mesmo nome";
                    frase = frase + fraseInterna;
                }
            }
            String fraseInterna = ". Entretanto podemos declarar variáveis com o mesmo nome em outros escopos";
            frase = frase + fraseInterna + ". Agora ja posso trabalhar conhecendo melhor o escopo";
        }
        System.out.println(frase);
    }
}
