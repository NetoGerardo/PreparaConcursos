package br.ifrn.prepara.apresentacao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ifrn.prepara.modelo.Questao;
import br.ifrn.prepara.negocio.GerenteSimulado;


@WebServlet("/simulado")
public class GeraSimuladoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GeraSimuladoServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GerenteSimulado negocio = new GerenteSimulado();
		List<Questao> lista = negocio.listQuestoes();
		request.getSession().setAttribute("questoes", lista);
		request.getRequestDispatcher("exibeSimulado.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}




