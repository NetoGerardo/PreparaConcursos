package br.ifrn.prepara.negocio;

import br.ifrn.prepara.modelo.Caminho;
import br.ifrn.prepara.modelo.Resultado;

public class GerenteCaminhoEstudo {

	public GerenteCaminhoEstudo() {
		super();
	}
	
	public Caminho geraCaminhoEstudo(Resultado resultado){
		if(resultado.getResultado().equals("Você está precisando reforçar o seu inglês :( Mas temos a rota de estudos perfeita para você!")) {
			return new Caminho("Passo 1: Estudar inglês básico\nPasso 2: Inglês intermediário\nPasso 3: Inglês avançado");
		}
		return new Caminho("Você não precisa estudar!");
	}
}
