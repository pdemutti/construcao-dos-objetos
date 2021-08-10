package br.com.gulliver.beans;

import java.time.LocalDate;


public class Usuario {
	private int id;
	private String nome;
	private String foto;
	private LocalDate ultimoAcesso;
	private String email;
	private String senha;
	private String genero;
	private Boolean nivelAcesso;
	private LocalDate nascimento;
	private Cidade cidade;
	
	public Usuario(int id, String nome, String foto, LocalDate ultimoAcesso, String email, String senha, String genero,
			Boolean nivelAcesso, LocalDate nascimento, Cidade cidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.foto = foto;
		this.ultimoAcesso = ultimoAcesso;
		this.email = email;
		this.senha = senha;
		this.genero = genero;
		this.nivelAcesso = nivelAcesso;
		this.nascimento = nascimento;
		this.cidade = cidade;
	}
	
	public Usuario() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public LocalDate getUltimoAcesso() {
		return ultimoAcesso;
	}
	public void setUltimoAcesso(LocalDate ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Boolean getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(Boolean nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	
}
