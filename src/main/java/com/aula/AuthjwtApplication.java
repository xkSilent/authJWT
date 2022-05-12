package com.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aula.domain.Usuario;
import com.aula.repositories.UsuarioRepository;

@SpringBootApplication
public class AuthjwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthjwtApplication.class, args);
	}
	
	@Autowired
	private UsuarioRepository usuRepository;
	
	public void instantiateDatabase() {
		
		Usuario usu = new Usuario();
		usu.setNome("Joao");
		usu.setEmail("jao@gmail.com");
		usu.setSenha("12345");
		
		usuRepository.save(usu);
	}


}
