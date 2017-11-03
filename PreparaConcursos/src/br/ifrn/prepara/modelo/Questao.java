package br.ifrn.prepara.modelo;

/**
 *
 * @author Gerardo
 */
public class Questao {
    
	private int id;
	private String enunciado;
	private String alternativa1;
	private String alternativa2;
	private String alternativa3;
	private String alternativa4;
	private String resposta;
	
	public Questao() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAlternativa1() {
		return alternativa1;
	}
	public void setAlternativa1(String alternativa1) {
		this.alternativa1 = alternativa1;
	}
	public String getAlternativa2() {
		return alternativa2;
	}
	public void setAlternativa2(String alternativa2) {
		this.alternativa2 = alternativa2;
	}
	public String getAlternativa3() {
		return alternativa3;
	}
	public void setAlternativa3(String alternativa3) {
		this.alternativa3 = alternativa3;
	}
	public String getAlternativa4() {
		return alternativa4;
	}
	public void setAlternativa4(String alternativa4) {
		this.alternativa4 = alternativa4;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	@Override
	public String toString() {
		return "Questao [id=" + id + ", enunciado=" + enunciado + ", alternativa1=" + alternativa1 + ", alternativa2="
				+ alternativa2 + ", alternativa3=" + alternativa3 + ", alternativa4=" + alternativa4 + ", resposta="
				+ resposta + "]";
	}
	
}
