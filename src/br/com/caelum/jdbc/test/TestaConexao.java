package br.com.caelum.jdbc.test;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		System.out.println("Conectado com sucesso!");
		con.close();
	}
}
