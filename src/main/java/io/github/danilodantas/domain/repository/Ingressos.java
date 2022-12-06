package io.github.danilodantas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.danilodantas.domain.entity.Ingresso;

public interface Ingressos extends JpaRepository<Ingresso, Integer>{

}
