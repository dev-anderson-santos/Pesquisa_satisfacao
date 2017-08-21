package br.com.biblioteca.model;

public enum Opcao {

	AMEI("Amei"), GOSTEI("Gostei"), NAO_GOSTEI("Não gostei");
	
	public String valor;
	Opcao(String valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
}
