package programa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite valor do produto: ");
        Double valorDoProduto = sc.nextDouble();

        System.out.print("Dogite o tipo do pagamento [1 = Á Vista / 2 = A Prazo]: ");
        Integer tipoDoPagamento = sc.nextInt();

        boolean pagamentoAVista = tipoDoPagamento.equals(1);

        Double juros;
        if (pagamentoAVista) {
            juros = 0.0;
        } else {
            juros = 10.0;
        }

        Double acrescimo = valorDoProduto * juros / 100;
        Double valorTotal = acrescimo + valorDoProduto;

        System.out.println("Total : " + valorTotal);
        System.out.println("Juros : " + acrescimo);


        sc.close();


    }
}
