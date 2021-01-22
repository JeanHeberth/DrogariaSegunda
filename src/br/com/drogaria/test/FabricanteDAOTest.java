package br.com.drogaria.test;

import org.junit.Test;

import br.com.drogaria.dao.FabricanteDao;
import br.com.drogaria.domain.Fabricante;

public class FabricanteDAOTest {

	@Test
	public void salvar() throws Exception {

		Fabricante f1 = new Fabricante();
		f1.setDescricao("Descrição1");

		Fabricante f2 = new Fabricante();
		f2.setDescricao("Descrição2");

		FabricanteDao fdao = new FabricanteDao();
		fdao.salvar(f1);
		fdao.salvar(f2);

	}

}
