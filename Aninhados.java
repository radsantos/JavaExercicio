import java.util.Scanner;

public class Aninhados {

	public static void main(String[] args) {

		
		
		
		/*Faça um programa que receba uma nota float  e imprima as seguintes informações. 

			Se a nota for maior  e igual a 90, imprimir: Aprovado: Conceito A. 

			Se a nota  for maior igual a 80, imprimir: Aprovado: Conceito B. 

			Se a nota for maior igual a 60, imprimir: Aprovado: Conceito C. 

			Se a nota for maior igual a 50, imprimir: Para analise: Conceito D. 

			Se a nota for diferente, imprimir: Reprovado: Conceito E. 
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
		
		float nota = 0.0f;
		
		System.out.print("Entre com a nota do aluno: ");
		nota = sc.nextFloat();
		
		if(nota >= 90) {
			System.out.println("Aprovado: Conceito A");
		}else if(nota >= 80) {
			System.out.println("Aprovado: Conceito B");
		}else if(nota >= 60) {
			System.out.println("Aprovado: Conceito C");
		}else if(nota >= 50) {
			System.out.println("Aprovado: Conceito D");
		}else {
			System.out.println("Reprovado: Conceito E");
		}
	}

}
