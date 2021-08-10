package br.com.gulliver.implementacao;

import br.com.gulliver.beans.Cidade;
import br.com.gulliver.beans.Endereco;
import br.com.gulliver.beans.Hotel;

public class TesteHotelGulliver {

	public static void main(String[] args) {
		
		Cidade cidade = new Cidade();
		cidade.setCidade("São Paulo");
		cidade.setEstado("São Paulo");
		cidade.setSiglaEstado("SP");
		cidade.setPais("Brasil");
		cidade.setSiglaPais("BR");
		cidade.setId(123);
	
		Endereco endereco = new Endereco();
		endereco.setBairro("Cambuci");
		endereco.setCep("01528030");
		endereco.setCidade(cidade);
		endereco.setId(0);
		endereco.setLogradouro("Rua Vitorio Emanuel");
		endereco.setNumero(146);
		
 		Hotel hotel = new Hotel();
		hotel.setEndereco(endereco);
		hotel.setClassificacao(5);
		hotel.setEmail("emaildohotel@hotel.com");
		hotel.setFone("113344-6677");
		hotel.setSite("www.hoteldocliente.com");
		hotel.setValor("100,00");
		
		System.out.println("<<<< Dados do Hotel >>>>");
		System.out.println("Bairro: " + hotel.getEndereco().getBairro());
		System.out.println("Cidade: " + hotel.getEndereco().getCidade().getCidade());
		System.out.println("Logradouro: " + hotel.getEndereco().getLogradouro());
		System.out.println("Valor da diária: " + hotel.getValor());
		
	}

}
