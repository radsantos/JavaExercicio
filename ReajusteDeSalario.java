import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Scanner;

public class ReajusteDeSalario {

	public static void main(String[] args) {

	
		/*
		 * Uma empresa decide dar um aumento de 30% aos funcion�rios cujo sal�rio � inferior a 500 reais.
		 * Fa�a um programa que receba o sal�rio de um funcion�rio e exiba o valor reajustado ou uma
		 * mensagem caso o funcion�rio n�o tenha direito ao aumento.
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		double porcentagemDeAumento = 0.30;
		
		System.out.println("Entre com o sal�rio: ");
		double salario = sc.nextDouble();
		
		if(salario >= 500){
			System.out.println("N�o tem direito ao aumento");
		}else {
			double reajusteDoSalario = salario * porcentagemDeAumento;
			double salarioAjustado = salario + reajusteDoSalario;
			
			System.out.println("Sal�rio Reajustado: R$ " + salarioAjustado);
			

			
		}
		
		
		
	}

}
