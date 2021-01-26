package br.com.drogaria.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.dao.FuncionarioDao;
import br.com.drogaria.domain.Funcionario;

public class FuncionarioDaoTest {

	@Test
	@Ignore
	public void salvar() throws Exception {

		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("042.438.771-90");
		funcionario.setFuncao("Auxiliar Administrativo");
		funcionario.setNome("Jessica Jasmine");
		funcionario.setSenha("A1B2C3");

		FuncionarioDao funciDao = new FuncionarioDao();
		funciDao.salvar(funcionario);

	}

	@Test
	@Ignore
	public void listar() {
		FuncionarioDao funciDao = new FuncionarioDao();
		List<Funcionario> funcionarios = funciDao.listar();
		System.out.println(funcionarios);
	}

	@Test
	@Ignore
	public void buscarPorCodigo() {
		FuncionarioDao funciDao = new FuncionarioDao();

		Funcionario funcionario = funciDao.buscarPorCodigo(1L);
		System.out.println(funcionario);

	}

	@Test
	@Ignore
	public void excluir() throws Exception {

		FuncionarioDao funciDao = new FuncionarioDao();

		Funcionario funcionario = funciDao.buscarPorCodigo(3L);
		funciDao.excluir(funcionario);
	}

	@Test
	@Ignore
	public void editar() throws Exception {

		FuncionarioDao funciDao = new FuncionarioDao();
		Funcionario funcionario = funciDao.buscarPorCodigo(2L);

		funcionario.setCpf("042.438.771-90");
		funcionario.setFuncao("Auxiliar Administrativo");
		funcionario.setNome("Jessica Jasmine dos Santos");
		funcionario.setSenha("A1B2C3D4");

		funciDao.editar(funcionario);

	}
}
