import java.util.Scanner;

public class MenuDeOpcoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Escolha a opção: \n");
		System.out.printf("1 - Soma de 2 números.\n" + "2 - Diferença entre 2 números(maior pelo menor).\n"
				+ "3 - Produto entre 2 números.\n" + "4 - Divisão entre 2 números(o denominador não pode ser zero).");
		System.out.println();
		System.out.print("Opção: ");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1: {
			System.out.print("Informe o primeiro valor: ");
			int valor1 = sc.nextInt();

			System.out.print("Informe o segundo valor: ");
			int valor2 = sc.nextInt();

			int soma = valor1 + valor2;

			System.out.println("Soma: " + soma);
			break;
		}
		case 2: {
			System.out.print("Informe o primeiro valor: ");
			int valor1 = sc.nextInt();

			System.out.print("Informe o segundo valor: ");
			int valor2 = sc.nextInt();

			int soma = 0;

			if (valor1 > valor2) {

				int maior = valor1;
				soma = maior - valor2;
			} else {
				int maior = valor2;
				soma = maior - valor1;
			}

			System.out.println("Soma: " + soma);
			break;

		}

		case 3: {
			System.out.print("Informe o primeiro valor: ");
			int valor1 = sc.nextInt();

			System.out.print("Informe o segundo valor: ");
			int valor2 = sc.nextInt();

			int soma = valor1 * valor2;

			System.out.println("Soma: " + soma);
			break;

		}

		case 4: {
			System.out.print("Informe o primeiro valor: ");
			int valor1 = sc.nextInt();

			System.out.print("Informe o segundo valor: ");
			int valor2 = sc.nextInt();

			int soma = valor1 / valor2;

			System.out.println("Soma: " + soma);
			break;

		}

		default: {
			System.out.println("Opção inválida.");
		}

		}

	}

}
