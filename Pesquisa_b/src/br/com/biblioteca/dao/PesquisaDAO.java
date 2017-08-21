package br.com.biblioteca.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.biblioteca.model.Opcao;
import br.com.biblioteca.model.Pesquisa;
import br.com.biblioteca.model.Resultado;
import br.com.biblioteca.util.HibernateUtil;

public class PesquisaDAO {

	private transient Session session;
	private transient Transaction transaction;
	
	public void create(Pesquisa p) throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(p);
		transaction.commit();
		session.close();
	}
	
	public List<Resultado> findAll(){
		session = HibernateUtil.getSessionFactory().openSession();
		//List<Pesquisa> lista = session.createQuery("select opcao, count(opcao) from Pesquisa group by opcao").list();
		org.hibernate.Query query = session.createQuery("select opcao, count(opcao) from Pesquisa group by opcao");
		List<Object[]> lista = query.list();
		
		List<Resultado> results = new ArrayList<>();
		
		for (Object[] object : lista) {
			String opcaoEscolhida = ((Opcao) object[0]).valor;
			int qtd = (((Long) object[1]).intValue());
			
			results.add(new Resultado(opcaoEscolhida, qtd));
		}
						
		session.close();
		
		return results;
	}
	
	public List<Long> listarTotal() {
		session = HibernateUtil.getSessionFactory().openSession();
		
		org.hibernate.Query query = session.createQuery("select count(opcao) from Pesquisa");
		List<Long> totais =  query.list();
		
		return totais;
	}
	
}
