package br.ifrn.prepara.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.ifrn.prepara.modelo.Questao;

public class QuestaoDAO {

	private Connection con = null;
	private final String USER = "postgres";
	private final String PASS = "postgres";

	public QuestaoDAO() {
		super();
		try {
			// Carrega o driver do banco de dados na memória
			Class.forName("org.postgresql.Driver");
			// Solicita que seja estabelecia a conexão com o banco de dados
			// São informados: a URL do banco, o usuário do banco e a senha correspondente
			con = DriverManager.getConnection("jdbc:postgresql://localhost/prepara", USER, PASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public List<Questao> listQuestoes() {
		if (con != null) {
			try {
				// Criação da classe que permite a realização de consultas
				Statement stmt = con.createStatement();
				String SQL = "SELECT * FROM questoes";
				// Realização da consulta ao banco
				ResultSet resultado = stmt.executeQuery(SQL);
				// Extrai os resultados da consulta
				return extraiQuestoes(resultado);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return null;
	}

	private List<Questao> extraiQuestoes(ResultSet resultado) throws SQLException {
		List<Questao> questoes = new ArrayList<Questao>();
		while (resultado.next()) {
			Questao q = new Questao();
			q.setId(resultado.getInt(1));
			q.setAlternativa1(resultado.getString(2));
			q.setAlternativa2(resultado.getString(3));
			q.setAlternativa3(resultado.getString(4));
			q.setAlternativa4(resultado.getString(5));
			q.setResposta(resultado.getString(6));
			q.setEnunciado(resultado.getString(7));
			questoes.add(q);
		}
		return questoes;
	}

}