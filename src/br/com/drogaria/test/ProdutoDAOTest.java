package br.com.drogaria.test;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.dao.FabricanteDAO;
import br.com.drogaria.dao.ProdutoDAO;
import br.com.drogaria.domain.Fabricante;
import br.com.drogaria.domain.Produto;

public class ProdutoDAOTest {

	@Test
	@Ignore
	public void inserir() {

		FabricanteDAO fdao = new FabricanteDAO();

		Fabricante fabricante = fdao.buscarPorCodigo(4L);

		Produto produto = new Produto();
		produto.setDescricao("Perfume");
		produto.setPreco(new BigDecimal(59.99D));
		produto.setQuantidade(10);
		produto.setFabricante(fabricante);

		ProdutoDAO proDAO = new ProdutoDAO();
		proDAO.salvar(produto);
	}

	@Test
	@Ignore
	public void buscarPorCodigo() {

		ProdutoDAO produtoDao = new ProdutoDAO();
		Produto produto = produtoDao.buscarPorCodigo(2L);
		System.out.println(produto);
	}

	@Test
	public void listar() {

		ProdutoDAO produtoDao = new ProdutoDAO();
		List<Produto> produtos = produtoDao.listar();
		System.out.println(produtos);

	}

}