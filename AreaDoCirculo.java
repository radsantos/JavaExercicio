
public class AreaDoCirculo {
	
	
	public static void main(String[] args) {
		
		/**
		 * Área do Círculo - 1002
		 * A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
		 * - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
		 * 
		 * Entrada
			A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

			Saída
			Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double).
		 * 
		 */
		
		
		final double PI = 3.14159;
		double raio;
		double area;
		
		raio = 150.0;
		
		
		
		area = PI * (raio * raio);
		
		System.out.print("A="+ String.format("%.4f",area));
		
		
	}
	
}

