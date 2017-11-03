package br.ifrn.prepara.negocio;

import java.util.List;

import br.ifrn.prepara.modelo.Questao;
import br.ifrn.prepara.modelo.Resposta;
import br.ifrn.prepara.modelo.Resultado;
import br.ifrn.prepara.persistencia.QuestaoDAO;

public class GerenteSimulado {

	private QuestaoDAO dao;
	
	public GerenteSimulado() {
		super();
		dao = new QuestaoDAO();
	}
	
	public List<Questao> listQuestoes() {
		return dao.listQuestoes();
	}

	public Resultado avaliaResultado(List<Resposta> respostas, List<Questao> questoes) {
		int cont = 0;
		for (Questao questao : questoes) {
			if(questao.getResposta().equals(respostas.get(cont).getResposta())) {
				return new Resultado("Você acertou todas! Vai se dar bem nesse concurso! Criamos uma rota de estudos para você deixar suas chances ainda maiores!");
			}						
		}
		return new Resultado("Você está precisando reforçar o seu inglês :( Mas temos a rota de estudos perfeita para você!");
	}

}
