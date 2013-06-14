package br.com.cadastro.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.classic.Session;

import br.com.cadastro.modelo.Pessoa;
import br.com.cadastro.util.HibernateUtil;
 
public class PessoaDao {
 
	private Session session; 
 
		public void inserir(Pessoa pessoa){
			session = HibernateUtil.getSessionFactory().openSession();
 
			try{
				session.beginTransaction();
				session.save(pessoa);
				session.getTransaction().commit();
 
			}finally{
				session.close();
 
			}
		}
 
		public void alterar(Pessoa pessoa){
			session = HibernateUtil.getSessionFactory().openSession();
 
			try{
				session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.saveOrUpdate(pessoa);
				session.getTransaction().commit();
			}finally{
				session.close();
 
			}
		}
 
		public void excluir(Pessoa pessoa){
			session = HibernateUtil.getSessionFactory().openSession();
 
			try{
				session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.delete(pessoa);
				session.getTransaction().commit();
 
			}finally{
				session.close();
 
			}
		}
 
		@SuppressWarnings("unchecked")
		public List<Pessoa> listar(){
			session = HibernateUtil.getSessionFactory().openSession();
 
			try{
				Criteria cri = session.createCriteria(Pessoa.class);
				return cri.list();
			}finally{
				session.close();
 
			}
		}
}