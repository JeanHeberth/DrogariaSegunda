package br.com.drogaria.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.dao.FuncionarioDAO;
import br.com.drogaria.domain.Funcionario;

public class FuncionarioDAOTest {

	@Test
	@Ignore
	public void salvar() throws Exception {

		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("042.438.771-90");
		funcionario.setFuncao("Auxiliar Administrativo");
		funcionario.setNome("Jessica Jasmine");
		funcionario.setSenha("A1B2C3");

		FuncionarioDAO funciDao = new FuncionarioDAO();
		funciDao.salvar(funcionario);

	}

	@Test
	@Ignore
	public void listar() {
		FuncionarioDAO funciDao = new FuncionarioDAO();
		List<Funcionario> funcionarios = funciDao.listar();
		System.out.println(funcionarios);
	}

	@Test
	@Ignore
	public void buscarPorCodigo() {
		FuncionarioDAO funciDao = new FuncionarioDAO();

		Funcionario funcionario = funciDao.buscarPorCodigo(1L);
		System.out.println(funcionario);

	}

	@Test
	@Ignore
	public void excluir() throws Exception {

		FuncionarioDAO funciDao = new FuncionarioDAO();

		Funcionario funcionario = funciDao.buscarPorCodigo(3L);
		funciDao.excluir(funcionario);
	}

	@Test
	@Ignore
	public void editar() throws Exception {

		FuncionarioDAO funciDao = new FuncionarioDAO();
		Funcionario funcionario = funciDao.buscarPorCodigo(2L);

		funcionario.setCpf("042.438.771-90");
		funcionario.setFuncao("Auxiliar Administrativo");
		funcionario.setNome("Jessica Jasmine dos Santos");
		funcionario.setSenha("A1B2C3D4");

		funciDao.editar(funcionario);

	}
}
