<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.List, br.ifrn.prepara.modelo.Concurso, br.ifrn.prepara.modelo.Questao"%>
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
		List<Questao> questoes = (List<Questao>) request.getSession().getAttribute("questoes");		
		if (questoes == null) {
			response.sendRedirect("/PreparaConcursos/index.html");
			return;
		}
		if (questoes.isEmpty()) {
			out.println("<h2>Nenhuma questão cadastrada!</h2>");
		} else {
	%>
	<form action="/PreparaConcursos/avalia" method="get">
		<table border="1">
			<tr>
				<th>Simulado</th>
			</tr>
			<%
				int cont = 1;
					for (Questao q : questoes) {
						out.println("<tr><td> " + cont + " - " + q.getEnunciado() + "</td>");
						out.println("<tr><td> A)" + q.getAlternativa1() + "</td>");
						out.println("<tr><td> B)" + q.getAlternativa2() + "</td>");
						out.println("<tr><td> C)" + q.getAlternativa3() + "</td>");
						out.println("<tr><td> D)" + q.getAlternativa4() + "</td>");
						out.println("<tr><td> Resposta por extenso <input type='text' name='questao" + cont + "'></td>");
						cont++;
					}
			%>
		</table>
		<input type="submit" value="Enviar resposta" />
	</form>
	<%
		}
	%>
	<hr />
	&copy;Copyright Turma de Arquitetura de Software/TADS/IFRN/2017.2
</body>
</html>