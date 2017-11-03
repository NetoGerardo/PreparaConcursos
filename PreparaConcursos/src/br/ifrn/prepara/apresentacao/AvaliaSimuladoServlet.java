package br.ifrn.prepara.apresentacao;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ifrn.prepara.modelo.Resposta;
import br.ifrn.prepara.modelo.Resultado;
import br.ifrn.prepara.modelo.Questao;
import br.ifrn.prepara.negocio.GerenteSimulado;


@WebServlet("/avalia")
public class AvaliaSimuladoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AvaliaSimuladoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GerenteSimulado negocio = new GerenteSimulado();
		List<Resposta> respostas = new ArrayList<Resposta>();		
		List<Questao> questoes = (List<Questao>) request.getSession().getAttribute("questoes");
		int cont = 1;
		for (Questao questao : questoes) {
			Resposta resposta = new Resposta();
			resposta.setResposta(request.getParameter("questao"+cont));
			respostas.add(resposta);
			cont++;
		}
		Resultado resultado = negocio.avaliaResultado(respostas,questoes);
		request.setAttribute("resultado", resultado);
		request.getRequestDispatcher("exibeResultado.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
