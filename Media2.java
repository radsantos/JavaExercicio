
public class Media2 {

	public static void main(String[] args) {

		/*Média 2 - 1006
		 * 
		 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
		 * A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
		 * Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
		 * 
		 * Entrada
     		O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
		 * 
		 * Saída
			Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade.
 			Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado
		 */
		
		
		
		double a,b,c;
		double media = 0.0;
		
		double pA = 2.0;
		double pB = 3.0;
		double pC = 5.0;
		
		
		a = 5.0;
		b = 10.0;
		c = 10.0;
		
		media = ((pA * a) + (pB * b) + (pC * c)) / (pA + pB + pC);
		
		System.out.printf("Media = %.1f ", media);
		
		
	}

}
