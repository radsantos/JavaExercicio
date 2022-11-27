import java.util.Scanner;

public class MesesDoAno {

	public static void main(String[] args) {
		
		
		/*Usando o switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o mês correspondente a este número. Isto é.
		 *  Janeiro se 1, Fevereiro se 2 e assim por diante.
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o numero de 1 até 12:");
		int valor = sc.nextInt();
		
		switch(valor) {
		
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
			
			default:
				System.out.println("Opção inválida");
		}
	}

}
