package io.github.danilodantas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.danilodantas.domain.entity.Cliente;

public interface Clientes extends JpaRepository<Cliente, Integer>{

}
