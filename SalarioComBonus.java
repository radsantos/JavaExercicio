import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus {

	public static void main(String[] args) {
		
		
		/*Salário com Bônus - 1009
		 * 
		 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
		 Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

		*Entrada
			O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o 
		salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

		*Saída
			Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Nome:");
		String name = sc.next();
		System.out.print("Salário: ");
		double salary = sc.nextDouble();
		System.out.print("Total de Vendas: ");
		double totalVendas = sc.nextDouble();
		
		double discount = 0.15;
		
		double total = salary + totalVendas * discount;
		
		System.out.printf("Total: %.2f ", total);
		
		
		
	}

}
