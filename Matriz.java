
public class Matriz {

	public static void main(String[] args) {
	
		//Leia uma matriz 4x4, conte e escreva quantos valores maiores que 10 ela possui.
		

		int numeros[][] = new int[4][4];
		
		numeros[0][0] = 2;
		numeros[0][1] = 11;
		numeros[0][2] = 14;
		numeros[0][3] = 5;
		
		numeros[1][0] = 8;
		numeros[1][1] = 20;
		numeros[1][2] = 155;
		numeros[1][3] = 10;
		
		numeros[2][0] = 0;
		numeros[2][1] = 3;
		numeros[2][2] = 9;
		numeros[2][3] = 5;
		
		numeros[3][0] = 90;
		numeros[3][1] = 23;
		numeros[3][2] = 65;
		numeros[3][3] = 7;
		
		
	
		
		int cont = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				
				if(numeros[i][j] > 10) {
					 cont++;
				}
				
			}
			
			
		}
		
		System.out.println("Total: " + cont);
		
		
	}

}
