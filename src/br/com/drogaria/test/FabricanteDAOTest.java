package br.com.drogaria.test;

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
		f1.setDescricao("Descri��o1");

		Fabricante f2 = new Fabricante();
		f2.setDescricao("Descri��o2");

		FabricanteDao fdao = new FabricanteDao();
		fdao.salvar(f1);
		fdao.salvar(f2);

	}

	@Test
	@Ignore
	public void listar() {
		FabricanteDao fdao = new FabricanteDao();
		List<Fabricante> fabricantes = fdao.listar();

		for (Fabricante fabricante : fabricantes) {
			System.out.println(fabricante);
		}

	}

	@Test
	public void buscarPorCodigo() {
		FabricanteDao fdao = new FabricanteDao();

		Fabricante f1 = fdao.buscarPorCodigo(1L);

		System.out.println(f1);

	}

}
