package programa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        Integer quantidadeDeProduto = sc.nextInt();

        Double valorSubtotal = valorProduto * quantidadeDeProduto;

        Boolean quantidadeSuperiorQueDez = quantidadeDeProduto >= 10;
        Double percentualDesconto = 0.0;

        if (quantidadeSuperiorQueDez){
            percentualDesconto = 10.0;
        }
        Double desconto = valorSubtotal * percentualDesconto / 100;
        Double valorComDesconto = valorSubtotal -desconto;

        System.out.println("Valor total: " + valorComDesconto);


        sc.close();


    }
}
