import java.util.Scanner;

public class SomaDosAlgarismos {

	public static void main(String[] args) {
		
		
		/*
		 * Escreva um programa que leia um número inteiro maior do que zero e devolva, na tela, a soma de todos os seus algarismo. 
		 * Por exemplo, ao número 251 corresponderá o valor 8 (2 + 5 + 1). 
		 * Se o número lido não for maior do que zero o programa terminará com a mensagem “Número inválido”. 
		 * 
		 * 
		 * 
		 */
				

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o valor: ");
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Número inválido");

		} else {

			int soma = 0;

			while (numero > 0) {
				soma += (numero % 10);

				numero /= 10;
				System.out.println("O valor de soma é: " + soma);
			}
			System.out.println();
			System.out.println("A soma dos algarismo é: " + soma);
		}

	}

}
