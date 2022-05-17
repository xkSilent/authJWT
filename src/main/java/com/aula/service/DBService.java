package com.aula.service;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.aula.domain.Usuario;
import com.aula.domain.enums.Perfil;
import com.aula.repositories.UsuarioRepository;

@Service
public class DBService {
	
	@Autowired
	private UsuarioRepository usuRepository;
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	public void instantiateDatabase() {
		
		Usuario usu1 = new Usuario();
		usu1.setNome("Joao");
		usu1.setEmail("jao@gmail.com");
		usu1.setSenha(pe.encode("12345"));
		usu1.addPerfil(Perfil.ADMIN);
		
		Usuario usu2 = new Usuario();
		usu2.setNome("Maria");
		usu2.setEmail("maria@gmail.com");
		usu2.setSenha(pe.encode("12345"));
		usu2.addPerfil(Perfil.USUARIO);
		
		usuRepository.saveAll(Arrays.asList(usu1,usu2));
	}

}
