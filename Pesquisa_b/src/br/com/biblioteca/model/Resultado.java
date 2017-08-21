package br.com.biblioteca.model;

public class Resultado {

	private String opcaoEscolhida;
	private Integer qtd;
	private Integer total;

	public Resultado() {}

	public Resultado(String opcaoEscolhida, Integer qtd) {
		this.opcaoEscolhida = opcaoEscolhida;
		this.qtd = qtd;
	}

	public String getOpcaoEscolhida() {
		return opcaoEscolhida;
	}

	public void setOpcaoEscolhida(String opcaoEscolhida) {
		this.opcaoEscolhida = opcaoEscolhida;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	public Integer getTotal() {
		return total;
	}

}
