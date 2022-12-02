import java.util.Scanner;

public class CalcularNumeroPositivo {

	public static void main(String[] args) {

		
		/*Leia um número fornecido pleo usuário. Se este número for positivo calcule a raiz quadrada do número. 
		 * Se o número for negativo, mostre uma mensagem dizendo que o número é inválido. 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o número: ");
		int numero = sc.nextInt();
		
		if(numero > 0) {
			
			System.out.println("Raiz quadrada: " + (int) Math.sqrt(numero));
		}
		else {
			System.out.println("Número inválido");
		}
		
	}

}
