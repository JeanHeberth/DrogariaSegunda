package br.com.drogaria.test;

import org.junit.Test;

import br.com.drogaria.util.HibernateUtil;

public class GerarTabelasTest {

	@Test
	public void main() {
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
	}

}
