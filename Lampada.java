package Java;

public class Lampada {
	// Mtodos com parametros

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;

	boolean ligada;

	void ligar() {

		ligada = true;
	}

	void desligar() {

		ligada = false;
	}

	void mostrarEstado() {

		if (ligada) {
			System.out.println("L�mpada est� ligado");
		} else {
			System.out.println("L�mpada est� desligado");
		}

	}

	void mudarEstado() {

		if (ligada) {
			desligar();
		} else {
			ligar();
		}

	}

}
