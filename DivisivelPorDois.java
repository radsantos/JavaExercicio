import java.util.Scanner;

public class DivisivelPorDois {

	public static void main(String[] args) {
		
		
		/*
		 *  Faça um programa que receba uma valor e verifique se este número é divisivel por dois. 

		 		O valor de entrada não pode se menor que zero. 

				Se o valor do divisivel por dois mostrar para o usuário que ele é par. 

				Caso contrário mostrar para usuário que ele é ímpar. 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o valor: ");
		int num1 = sc.nextInt();

		if (num1 < 0) {
			System.out.println("número não pode se menor que zero ");
		} else if (num1 % 2 == 0) {

			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	}

}
