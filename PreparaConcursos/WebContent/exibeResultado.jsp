<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="br.ifrn.prepara.modelo.Resultado"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Prepara!Concursos</title>
</head>
<body>
	<h1>Resposta do simulado</h1>
	<hr />
	<%
		Resultado resultado = (Resultado) request.getAttribute("resultado");
		request.getSession().setAttribute("resultado", resultado);
		if (resultado == null) {
			response.sendRedirect("/PreparaConcursos/index.html");
			return;
		}
		if (resultado.equals("")) {
			out.println("<h2>Nenhuma resposta cadastrada!</h2>");
		} else {
	%>
	<%
		out.println("<h1>" + resultado.getResultado() + "</h1>");
	%>

	<%
		}
	%>
	<form action="/PreparaConcursos/caminho" method="get">
		<input type="submit" value="Conferir rota de estudos" />
	</form>
	<form action="/PreparaConcursos/index.html" method="get">
		<input type="submit" value="Voltar para página inicial" />
	</form>

	<hr />
	&copy;Copyright Turma de Arquitetura de Software/TADS/IFRN/2017.2
</body>
</html>