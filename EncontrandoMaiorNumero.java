import java.util.Scanner;

public class EncontrandoMaiorNumero {

	public static void main(String[] args) {

		
		/*
		 * Faça um programa que receba dois números e mostre qual deles é o maior. 
		 * 
		 * 
		 * 
		 */
		
		
		
		Scanner sc = new Scanner(System.in);

		System.out.printf("Informe o número 1: ");
		int numero1 = sc.nextInt();
		System.out.printf("Informe o número 2: ");
		int numero2 = sc.nextInt();
		
		int aux = 0;
		
		if(numero1 > numero2) {
			aux = numero1;
			
			System.out.println("O Maior é: " + aux);
		}
		else {
			aux = numero2;
			
			System.out.println("O maior é: " + aux);
		}
		
	}

}
