import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número inteiro: ");
		int valor = sc.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			int resultado = valor * i;
			
			System.out.println(valor + " * " + i + " = " + resultado);
		}
	}

}
