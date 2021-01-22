package br.com.drogaria.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.drogaria.domain.Fabricante;
import br.com.drogaria.util.HibernateUtil;

public class FabricanteDao {

	public void salvar(Fabricante fabricante) throws Exception {

		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.save(fabricante);
			transacao.commit();
		} catch (RuntimeException ex) {
			if (transacao != null) {
				transacao.rollback();
			} throw ex;
		} finally {
			sessao.close();
		}

	}

}
