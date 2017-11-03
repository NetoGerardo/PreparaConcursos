package br.ifrn.prepara.modelo;

public class Resultado {
	
	private String resultado;

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public Resultado(String resultado) {
		this.resultado = resultado;
	}
	
	@Override
	public String toString() {
		return "Resultado [resultado=" + resultado + "]";
	}
	
}
