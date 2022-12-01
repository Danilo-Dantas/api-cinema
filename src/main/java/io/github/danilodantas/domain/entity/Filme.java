package io.github.danilodantas.domain.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filme")
public class Filme {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "qtd_ingresso")
	private Integer qtd_ingresso;
	
	@OneToMany(mappedBy = "filme")
	private Set<Ingresso> ingresso;
}
