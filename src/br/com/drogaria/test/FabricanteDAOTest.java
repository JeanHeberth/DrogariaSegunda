package br.com.drogaria.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.dao.FabricanteDao;
import br.com.drogaria.domain.Fabricante;

public class FabricanteDAOTest {

	@Test
	@Ignore
	public void salvar() throws Exception {

		Fabricante f1 = new Fabricante();
		f1.setDescricao("Descrição1");

		Fabricante f2 = new Fabricante();
		f2.setDescricao("Descrição2");

		FabricanteDao fdao = new FabricanteDao();
		fdao.salvar(f1);
		fdao.salvar(f2);

	}

	@Test
	public void listar() {
		FabricanteDao fdao = new FabricanteDao();
		List<Fabricante> fabricantes = fdao.listar();

		for (Fabricante fabricante : fabricantes) {
			System.out.println(fabricante);
		}

	}

}
