package secao12;

import java.time.Year;

/*
 * Crie uma classe para representar uma pessoa, com os atributos privados de nome, idade e altura.
 * Crie os métodos públicos necessários para sets e gets e também um método para imprimir os dados de uma pessoa.
 * 

 */


public class Pessoa {

	private String nome;
	private int ano_nascimento;
	private float altura;

	public Pessoa() {

	}

	public Pessoa(String nome, int ano_nascimento, float altura) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno_nascimento() {
		return ano_nascimento;
	}

	public void setAno_nascimento(int ano_nascimento) {

		this.ano_nascimento = ano_nascimento;

	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Integer calcularIdade() {

		Year anoAtual = java.time.Year.now();

		int idadeAtual = (int) (anoAtual.getValue() - ano_nascimento);

		return idadeAtual;

	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nAno Nascimento: " + ano_nascimento + "\nAltura:" + altura + "\nIdade: "
				+ calcularIdade();
	}

}
