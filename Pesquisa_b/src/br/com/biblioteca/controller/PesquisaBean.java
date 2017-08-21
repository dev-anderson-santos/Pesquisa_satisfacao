package br.com.biblioteca.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.biblioteca.dao.PesquisaDAO;
import br.com.biblioteca.model.Opcao;
import br.com.biblioteca.model.Pesquisa;
import br.com.biblioteca.model.Resultado;

@ManagedBean(name = "pesquisaMBean")
@ViewScoped
public class PesquisaBean {

	Pesquisa pesquisa = new Pesquisa();
	List<Resultado> resultado;
	//LocalDate data = LocalDate.now();
	Calendar datac;
	List<Integer> linhas;
	
	public PesquisaBean() {
		linhas = new ArrayList<>();
		linhas.add(1);	
	}
	
	public List<Integer> getLinhas() {
		return linhas;
	}
    public void adicionarLinhas() {	
    	
		linhas.add(1);		
	}
	
	public Pesquisa getPesquisa() {
		return pesquisa;
	}
	
	public String cadastra(Integer valor) throws Exception {
		
		switch (valor) {
			case 1:
				
				pesquisa.setOpcao(Opcao.AMEI);
				//pesquisa.setData(data);
				pesquisa.setDatac(datac.getInstance());
				
				break;
			case 2:
				
				pesquisa.setOpcao(Opcao.GOSTEI);
				//pesquisa.setData(data);	
				pesquisa.setDatac(datac.getInstance());
				
				break;
			case 3:
				
				pesquisa.setOpcao(Opcao.NAO_GOSTEI);
				//pesquisa.setData(data);
				pesquisa.setDatac(datac.getInstance());
				
				break;
		}
		
		new PesquisaDAO().create(pesquisa);
		
		
		return "agradecimento";
	}
	
	public List<Resultado> getResultados() {
				
		return new PesquisaDAO().findAll();
	}
	
	public List<Long> getResultados2() {
		getLinhas();
		return new PesquisaDAO().listarTotal();
	}
	
}
