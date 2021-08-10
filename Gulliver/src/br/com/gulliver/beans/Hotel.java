package br.com.gulliver.beans;


public class Hotel {
	private int id;
	private Endereco endereco;
	private int classificacao;
	private String valor;
	private String fone;
	private String site;
	private String email;
	private String observacao;
	
	public Hotel(int id, Endereco endereco, int classificacao, String valor, String fone, String site, String email,
			String observacao) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.classificacao = classificacao;
		this.valor = valor;
		this.fone = fone;
		this.site = site;
		this.email = email;
		this.observacao = observacao;
	}
	
	public Hotel() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
}
