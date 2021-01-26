package br.com.drogaria.test;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.drogaria.dao.FabricanteDAO;
import br.com.drogaria.dao.ProdutoDAO;
import br.com.drogaria.domain.Fabricante;
import br.com.drogaria.domain.Produto;


public class ProdutoDAOTest {

	
	@Test
	public void inserir() {

		FabricanteDAO fdao = new FabricanteDAO();

		Fabricante fabricante = fdao.buscarPorCodigo(4L);

		Produto produto = new Produto();
		produto.setDescricao("Perfume");
		produto.setPreco(new BigDecimal(59.99D));
		produto.setQuantidade(10);
		produto.setFabricante(fabricante);
		
		ProdutoDAO proDAO = new ProdutoDAO();
		proDAO.inserir(produto);
	}
}
