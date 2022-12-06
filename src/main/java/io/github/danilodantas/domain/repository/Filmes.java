package io.github.danilodantas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.danilodantas.domain.entity.Filme;

public interface Filmes extends JpaRepository<Filme, Integer>{

}
