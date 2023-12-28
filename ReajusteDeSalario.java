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
		 * Uma empresa decide dar um aumento de 30% aos funcionários cujo salário é inferior a 500 reais.
		 * Faça um programa que receba o salário de um funcionário e exiba o valor reajustado ou uma
		 * mensagem caso o funcionário não tenha direito ao aumento.
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		double porcentagemDeAumento = 0.30;
		
		System.out.println("Entre com o salário: ");
		double salario = sc.nextDouble();
		
		if(salario >= 500){
			System.out.println("Não tem direito ao aumento");
		}else {
			double reajusteDoSalario = salario * porcentagemDeAumento;
			double salarioAjustado = salario + reajusteDoSalario;
			
			System.out.println("Salário Reajustado: R$ " + salarioAjustado);
			

			
		}
		
		
		
	}

}
