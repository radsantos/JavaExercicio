import java.util.Scanner;

public class FuncaoDobro {

	
	
	public static void main(String[] args) {

		//Crie uma funcao que recebe como parâmetro um número e devolve o seu dobro.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int numero = sc.nextInt();
		
		System.out.println("o dobro do valor é: " + dobro(numero));
	
		
	}

	//Função para calular o dobro
	static int dobro(int valor) {
		
		return (int)Math.pow(valor, 2);
	}
}
