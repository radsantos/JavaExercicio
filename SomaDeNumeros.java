import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Scanner;

public class SomaDeNumeros {

	public static void main(String[] args) {

	
		/*
		 * Fa�a um programa que receba tr�s valores (A,B,C) e diga se:
		 * 	A soma de A+B � menor C;
		 * 	A soma de A+B � igual a C;
		 * 	Ou a soma de A+B � maior que C.
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com valor para A:");
		int valorA = sc.nextInt();
		
		System.out.println("Entre com valor para B:");
		int valorB = sc.nextInt();
		
		System.out.println("Entre com valor para C:");
		int valorC = sc.nextInt();
		
		int somaDeAmaisB = valorA + valorB;
		
		if(somaDeAmaisB < valorC){
			System.out.println("A soma de A mais B � menor que C");
		}
		
		else if(somaDeAmaisB == valorC){
			System.out.println("A soma de A mais B � igual que C");
		}
		else{
			
			System.out.println("A soma de A mais B � maior que C");
		}
		
		
		
	}

}
