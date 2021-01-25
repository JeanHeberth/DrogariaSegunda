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
		f1.setDescricao("Descrição1");

		Fabricante f2 = new Fabricante();
		f2.setDescricao("Descrição2");

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
	@Ignore
	public void buscarPorCodigo() {
		FabricanteDao fdao = new FabricanteDao();

		Fabricante f1 = fdao.buscarPorCodigo(12L);

		System.out.println(f1);

	}

	@Test
	@Ignore
	public void excluir() throws Exception {

		FabricanteDao fdao = new FabricanteDao();
		Fabricante fabricante = fdao.buscarPorCodigo(1L);

		if (fabricante != null) {
			fdao.excluir(fabricante);
		}
	}

	@Test
	@Ignore
	public void excluirPorCodigo() throws Exception {

		FabricanteDao fdao = new FabricanteDao();
		fdao.excluir(12L);
	}

	@Test
	@Ignore
	public void editar() throws Exception {
		Fabricante fabricante = new Fabricante();
		fabricante.setCodigo(11L);
		fabricante.setDescricao("João Victor Siqueira de Souza");

		FabricanteDao fdao = new FabricanteDao();
		fdao.editar(fabricante);

	}

	@Test
	@Ignore
	public void editarSimples() throws Exception {
		Fabricante fabricante = new Fabricante();
		fabricante.setCodigo(11L);
		fabricante.setDescricao("João Victor Siqueira de Souza");

		FabricanteDao fdao = new FabricanteDao();
		fdao.editarSimples(fabricante);

	}
}
