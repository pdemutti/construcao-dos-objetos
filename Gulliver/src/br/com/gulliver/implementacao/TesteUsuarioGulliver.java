package br.com.gulliver.implementacao;

import br.com.gulliver.beans.Cidade;
import br.com.gulliver.beans.Usuario;

public class TesteUsuarioGulliver {

	public static void main(String[] args) {
		Usuario objetoUser = new Usuario();
		
		objetoUser.setEmail("paulo@gulliver.com");
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
		
		System.out.println("<<<< Dados de usuario >>>>");
		System.out.println("Nome: " + objetoUser.getNome());
		System.out.println("Email: " + objetoUser.getEmail());

		System.out.println("<<<< Dados de endereço >>>>");
		System.out.println("Cidade: " + objetoUser.getCidade().getCidade());
		System.out.println("Estado: " + objetoUser.getCidade().getEstado() + "/" + objetoUser.getCidade().getSiglaEstado());
		System.out.println("País: " + objetoUser.getCidade().getPais());


	}

}
