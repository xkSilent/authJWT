package com.aula.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioController {
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/usuarios")
	public String teste() {
		return "Permissão de ADMIN";
	}
	
	@GetMapping("/usuario")
	public String teste2() {
		return "Permissão de usuario";
	}

}
