package br.com.caelum.jdbc.test;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsert {
	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setNome("Ronaldo Paggi");
		contato.setEmail("ronaldo.paggi@gmail.com");
		contato.setEndereco("Av. Henrique Gonçalves Baptista, 2245");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}
}
