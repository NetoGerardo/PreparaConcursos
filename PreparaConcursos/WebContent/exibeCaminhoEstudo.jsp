<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.ifrn.prepara.modelo.Caminho"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Prepara!Concursos</title>
</head>
<body>
	<h1>Simulado</h1>
	<hr />
	<%
		Caminho caminho = (Caminho) request.getAttribute("caminho");		
		if (caminho.getMateria() == null) {
			response.sendRedirect("/PreparaConcursos/index.html");
			return;
		}
		if (caminho.getMateria().equals("")) {
			out.println("<h2>Nenhuma questão cadastrada!</h2>");
		} else {
	%>
	<%
		out.println("<h1>"+caminho.getMateria()+"</h1>");
	%>
	<%
		}
	%>
	<hr />
	&copy;Copyright Turma de Arquitetura de Software/TADS/IFRN/2017.2
</body>
</html>