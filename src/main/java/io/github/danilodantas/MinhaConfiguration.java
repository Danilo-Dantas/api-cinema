package io.github.danilodantas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {


	@Bean(name = "applicationName") //NOMEANDO BEAN
	public String applicationName() {
		return ""
				+ "<h1>API-CINEMA</h1>  "
				+ "<p>Essa é a minha primeira API feita em Spring Boot.</p>"
				+ "<p>Para ter acesso ao banco, <a href='/h2-console'>clique aqui</a>";
	}
	
	@Bean() //BEAN SEM NOME, SERA UTILIZADO O NOME DO METODO
	public String outraConfiguracao() {
		return "configurei outro Bean e puxei na minha main, uhuuuu";
	}
}
