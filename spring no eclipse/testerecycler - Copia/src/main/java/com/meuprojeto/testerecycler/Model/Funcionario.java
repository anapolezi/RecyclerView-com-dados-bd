package com.meuprojeto.testerecycler.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionario") // especificando o nome da tabela do bd
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_funcionario") // Adicione isso
	private Long  id;//pk
	
    private String nome;
    private String filial;
    private String locacao;
    
    //contrutores
    public Funcionario() {
    	
    }
    public Funcionario( String nome, String filial, String locacao ) {
    	
    	this.nome = nome;
    	this.filial = filial;
    	this.locacao = locacao;
    	
    }
    
    
    //getters e setters
	public Long  getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFilial() {
		return filial;
	}
	public void setFilial(String filial) {
		this.filial = filial;
	}
	public String getLocacao() {
		return locacao;
	}
	public void setLocacao(String locacao) {
		this.locacao = locacao;
	}
}
