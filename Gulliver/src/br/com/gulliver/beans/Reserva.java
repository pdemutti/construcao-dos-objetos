package br.com.gulliver.beans;

import java.time.LocalDate;

public class Reserva {
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private Hotel hotel;
	private Usuario usuario;
	private int qtdHospedagem;

	public Reserva(LocalDate dataEntrada, LocalDate dataSaida, Hotel hotel, Usuario usuario) {
		super();
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.hotel = hotel;
		this.usuario = usuario;
	}
	
	public Reserva() {
		super();
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}
	
	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public LocalDate getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public int getQtdHospedagem() {
		return qtdHospedagem;
	}

	public void setQtdHospedagem(int qtdHospedagem) {
		this.qtdHospedagem = qtdHospedagem;
	}
}
