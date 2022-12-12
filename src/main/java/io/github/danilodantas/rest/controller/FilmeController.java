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

import static org.springframework.http.HttpStatus.*;

import java.util.Optional;

import io.github.danilodantas.domain.entity.Filme;
import io.github.danilodantas.domain.repository.Filmes;

@RestController
@RequestMapping("/api/filmes")
public class FilmeController {

	@Autowired
	private Filmes filmes;
	
	//BUSCAR FILME
	@GetMapping("{id}")
	public Filme buscarFilme( @PathVariable Integer id) {
		return filmes.findById(id).orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Filme não encontrado."));
	}
	
	//INSERIR FILME
	@PostMapping
	@ResponseStatus(CREATED)
	public Filme salvarFilme(@RequestBody Filme filme ) {
		return filmes.save(filme);
	}
	
	
	//DELETAR FILME
	@DeleteMapping("{id}")
	public String deletarFilme(@PathVariable Integer id) {
		Optional<Filme> filmeStatus = filmes.findById(id);
		if(filmeStatus.isPresent()) {
			String titulo = filmes.findById(id).get().getTitulo();
			filmes.deleteById(id);
			return "Filme [" + titulo + "] deletado com sucesso!";
		} else {
			throw new ResponseStatusException(NOT_FOUND, "Filme não encontrado.");
		}
	}
}
