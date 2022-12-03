import java.util.Scanner;

public class SomaDosNumeros {

	public static void main(String[] args) {

		
		/*
		 * 
		 * Faça um programa que lê um valor inteiro N e depois N números inteiros. Ao final, mostrar a soma dos N números.
		 */
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade: ");
		int numero = sc.nextInt();

		int soma = 0;

		for (int i = 0; i < numero; i++) {

			System.out.print("valores: ");
			 int valor = sc.nextInt();
			soma = soma + valor;
			

		}
		System.out.println("Total da soma: " + soma);

		
		
		sc.close();
	}

	
}
