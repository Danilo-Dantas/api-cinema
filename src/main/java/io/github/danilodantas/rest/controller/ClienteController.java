package io.github.danilodantas.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import io.github.danilodantas.domain.entity.Cliente;
import io.github.danilodantas.domain.repository.Clientes;

import static org.springframework.http.HttpStatus.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private Clientes clientes;

	// BUSCAR CLIENTE
	@GetMapping("{id}")
	public Cliente buscarCliente(@PathVariable Integer id) {
		return clientes.findById(id)
				.orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Cliente não encontrado"));
	}

	// INSERIR CLIENTE
	@PostMapping
	@ResponseStatus(CREATED)
	public Cliente salvarCliente(@RequestBody Cliente cliente) {
		return clientes.save(cliente);
	}

	// DELETAR CLIENTE
	@DeleteMapping("{id}")
	@ResponseStatus(NO_CONTENT)
	public void deletarCliente(@PathVariable Integer id) {
		Optional<Cliente> clienteStatus = clientes.findById(id);
		if (clienteStatus.isPresent()) {
			clientes.deleteById(id);
		} else {
			throw new ResponseStatusException(NOT_FOUND, "Cliente não encontrado");
		}
	}

}
