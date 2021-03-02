package Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class calcularIMC {

	public static void main(String[] args) {

		// Calculadora de índice de massa corpora
		
		double libras;
		double kilo;
		double altura;
		double imc = 0;
		String opcao;
		
		
		

		Scanner scan = new Scanner(System.in);

		System.out.println("Deseja informar seu peso em libras digite (l) para Kilogramas digite (k)?");
		 opcao = scan.nextLine();

		switch (opcao) {
		case "l":
			System.out.println("Informe o peso:");
			 libras = scan.nextDouble();

			System.out.println("Informe altura");
			 altura = scan.nextDouble();

			 imc = (libras * 703) / (altura * altura);

			break;

		case "k":
			System.out.println("Informe seu peso:");
			 kilo = scan.nextDouble();

			System.out.println("Informe altura");
			altura = scan.nextDouble();

			imc = kilo / (altura * altura);
			
			

		}
		
		
		if (imc < 18.5) {

			System.out.println("Seu indíce de massa é: " + imc + "Você está abaixo do peso.");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Seu indíce de massa é: " + imc + "Seu poso está normal.");

		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Seu indíce de massa é: " + imc + "Você está acima do peso ideal.");

		} else {
			System.out.println("Seu indíce de massa é: " + imc + "Você está obeso.");
		}
		

	}

}
