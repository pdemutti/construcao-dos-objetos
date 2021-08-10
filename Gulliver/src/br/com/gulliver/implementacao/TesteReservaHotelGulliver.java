package br.com.gulliver.implementacao;

import java.time.LocalDate;
import java.time.Period;

import br.com.gulliver.beans.Cidade;
import br.com.gulliver.beans.Endereco;
import br.com.gulliver.beans.Hotel;
import br.com.gulliver.beans.Reserva;
import br.com.gulliver.beans.Usuario;

public class TesteReservaHotelGulliver {

	public static void main(String[] args) {
		Usuario objetoUser = new Usuario();
		
		objetoUser.setEmail("gulliver@gulliver.com");
		objetoUser.setFoto("/img/gulliver.jpg");
		objetoUser.setGenero("MASCULINO");
		objetoUser.setId(1);
		objetoUser.setNivelAcesso(true);
		objetoUser.setSenha("dev@666");
		objetoUser.setNome("Paulo Demutti");
		
		Cidade cidade = new Cidade();
		cidade.setCidade("São Paulo");
		cidade.setEstado("São Paulo");
		cidade.setSiglaEstado("SP");
		cidade.setPais("Brasil");
		cidade.setSiglaPais("BR");
		cidade.setId(155);
		
		objetoUser.setCidade(cidade);
		
		Endereco endereco = new Endereco();
		endereco.setBairro("Cambuci");
		endereco.setCep("01528030");
		endereco.setCidade(cidade);
		endereco.setId(0);
		endereco.setLogradouro("Rua Vitorio Emanuel");
		endereco.setNumero(146);
		
		Hotel hotel = new Hotel();
		hotel.setEndereco(endereco);
		hotel.setEmail("emaildohotel@hotel.com");
		hotel.setFone("113344-6677");
		hotel.setSite("www.hoteldocliente.com");
		hotel.setValor("100,00");
		
		Reserva reserva = new Reserva();
		reserva.setHotel(hotel);
		
        LocalDate checkin = LocalDate.of(2020, 5, 4);
        LocalDate checkout = LocalDate.of(2020, 10, 10);

        Period period = Period.between(checkin, checkout);

		reserva.setDataEntrada(checkin);
		reserva.setDataSaida(checkout);
		reserva.setUsuario(objetoUser);
		reserva.setQtdHospedagem(period.getDays());

		String valorDiaria = hotel.getValor();
		String[] parts = valorDiaria.split(",");
		String part1 = parts[0];
		
		int valorFinal = Integer.parseInt(part1) * reserva.getQtdHospedagem();
		
		System.out.println("<<<< Reserva do Cliente >>>>");
		
		System.out.println("A data de check in está prevista para: " + reserva.getDataEntrada());
		System.out.println("Endereço: " + reserva.getHotel().getEndereco().getLogradouro());
		System.out.println("Numero: " + reserva.getHotel().getEndereco().getNumero());
        System.out.print("Ficará Hospedado por " + period.getDays() + " dias" );
        
        String newLine = System.getProperty("line.separator");
        System.out.println(newLine);
		System.out.println("O valor total de sua hospedagem é de R$" + valorFinal);

	}

}
