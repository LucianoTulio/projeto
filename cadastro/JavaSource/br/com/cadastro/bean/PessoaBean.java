package br.com.cadastro.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import br.com.cadastro.dao.PessoaDao;
import br.com.cadastro.modelo.Pessoa;
 
@ManagedBean(name="pessoaBean")
@ViewScoped
public class PessoaBean {
 
	Pessoa pessoa = new Pessoa();
 
	List<Pessoa> pessoas = new ArrayList<Pessoa>(); 
 
	//construtor
	public PessoaBean(){
		pessoas = new PessoaDao().listar();
		pessoa = new Pessoa();
	}
 
	//Métodos dos botões 
	public void cadastrar(ActionEvent actionEvent){
		new PessoaDao().inserir(pessoa);
		pessoas = new PessoaDao().listar();
		pessoa = new Pessoa();
	}
 
	public void alterar(ActionEvent actionEvent){
		new PessoaDao().alterar(pessoa);
		pessoas = new PessoaDao().listar();
		pessoa = new Pessoa();
	}
	public void excluir(ActionEvent actionEvent){
		new PessoaDao().excluir(pessoa);
		pessoas = new PessoaDao().listar();
		pessoa = new Pessoa();
	}
 
	//getters and setters
	public Pessoa getPessoa() {
		return pessoa;
	}
 
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
 
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
 
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
}