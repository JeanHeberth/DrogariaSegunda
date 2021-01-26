package br.com.drogaria.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.dao.FabricanteDAO;
import br.com.drogaria.domain.Fabricante;

public class FabricanteDAOTest {

	@Test
	@Ignore
	public void salvar() throws Exception {

		Fabricante f1 = new Fabricante();
		f1.setDescricao("Descrição 9");

		Fabricante f2 = new Fabricante();
		f2.setDescricao("Descrição 10");

		FabricanteDAO fdao = new FabricanteDAO();
		fdao.salvar(f1);
		fdao.salvar(f2);

	}

	@Test
	@Ignore
	public void listar() {
		FabricanteDAO fdao = new FabricanteDAO();
		List<Fabricante> fabricantes = fdao.listar();

		for (Fabricante fabricante : fabricantes) {
			System.out.println(fabricante);
		}

	}

	@Test
	@Ignore
	public void buscarPorCodigo() {
		FabricanteDAO fdao = new FabricanteDAO();

		Fabricante f1 = fdao.buscarPorCodigo(12L);

		System.out.println(f1);

	}

	@Test
	@Ignore
	public void excluir() throws Exception {

		FabricanteDAO fdao = new FabricanteDAO();
		Fabricante fabricante = fdao.buscarPorCodigo(1L);

		if (fabricante != null) {
			fdao.excluir(fabricante);
		}
	}

	@Test
	@Ignore
	public void editar() throws Exception {
		Fabricante fabricante = new Fabricante();
		fabricante.setCodigo(11L);
		fabricante.setDescricao("João Victor Siqueira de Souza");

		FabricanteDAO fdao = new FabricanteDAO();
		fdao.editar(fabricante);

	}
}
