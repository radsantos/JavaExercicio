import java.util.Locale;
import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {

		/*Diferença - 1007
		 * 
		 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		 * 
		 * Entrada
			O arquivo de entrada contém 4 valores inteiros.

		 * Saída
			Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
		 * 
		 */
		
		
		
//		
//		int a = 5, b = 6, c = 7, d = 8;
//		
//		int diferenca = (a * b - c * d);
//		
//		System.out.printf("DIFERENCA = " + diferenca);
		
		
		
		/*
		 * Utilizando a classe Scanner
		 * 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int diferenca = (a * b - c *d);
		
		System.out.print("DIFERNÇA = " + diferenca);
		
		
		
		
		
	}

}
