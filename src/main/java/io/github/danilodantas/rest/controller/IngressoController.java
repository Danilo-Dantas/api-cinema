package io.github.danilodantas.rest.controller;

import static org.springframework.http.HttpStatus.CREATED;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import io.github.danilodantas.domain.entity.Ingresso;
import io.github.danilodantas.domain.repository.Clientes;
import io.github.danilodantas.domain.repository.Filmes;
import io.github.danilodantas.domain.repository.Ingressos;

@RestController
@RequestMapping("/api/ingresso")
public class IngressoController {

	@Autowired
	private Ingressos ingressos;
	private Filmes filmes;
	private Clientes clientes;
	
	@PostMapping
	@ResponseStatus(CREATED)
	public Ingresso salvarIngresso(@RequestBody Ingresso ingresso) {
		return ingressos.save(ingresso);
		
	}
	
	
}
