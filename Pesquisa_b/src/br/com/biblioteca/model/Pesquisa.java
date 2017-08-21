package br.com.biblioteca.model;

//import java.time.LocalDate;
import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pesquisa")
public class Pesquisa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	private Opcao opcao;
	//private LocalDate data;
	private Calendar datac;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Opcao getOpcao() {
		return opcao;
	}
	public void setOpcao(Opcao opcao) {
		this.opcao = opcao;
	}
//	public LocalDate getData() {
//		return data;
//	}
//	public void setData(LocalDate data) {
//		this.data = data;
//	}
	public Calendar getDatac() {
		return datac;
	}
	public void setDatac(Calendar datac) {
		this.datac = datac;
	}
	
}
