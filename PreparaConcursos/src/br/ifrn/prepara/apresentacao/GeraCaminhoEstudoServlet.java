package br.ifrn.prepara.apresentacao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ifrn.prepara.modelo.Caminho;
import br.ifrn.prepara.modelo.Resultado;
import br.ifrn.prepara.negocio.GerenteCaminhoEstudo;


@WebServlet("/caminho")
public class GeraCaminhoEstudoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GeraCaminhoEstudoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GerenteCaminhoEstudo negocio = new GerenteCaminhoEstudo();
		Resultado resultado = (Resultado) request.getSession().getAttribute("resultado");
		Caminho caminho = negocio.geraCaminhoEstudo(resultado);
		request.setAttribute("caminho", caminho);
		request.getRequestDispatcher("exibeCaminhoEstudo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
