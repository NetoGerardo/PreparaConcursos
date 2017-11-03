package br.ifrn.prepara.negocio;

import br.ifrn.prepara.modelo.Caminho;
import br.ifrn.prepara.modelo.Resultado;

public class GerenteCaminhoEstudo {

	public GerenteCaminhoEstudo() {
		super();
	}
	
	public Caminho geraCaminhoEstudo(Resultado resultado){
		if(resultado.getResultado().equals("Voc� est� precisando refor�ar o seu ingl�s :( Mas temos a rota de estudos perfeita para voc�!")) {
			return new Caminho("Passo 1: Estudar ingl�s b�sico\nPasso 2: Ingl�s intermedi�rio\nPasso 3: Ingl�s avan�ado");
		}
		return new Caminho("Voc� n�o precisa estudar!");
	}
}
