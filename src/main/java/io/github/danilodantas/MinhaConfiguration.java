package io.github.danilodantas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {


	@Bean(name = "applicationName") //NOMEANDO BEAN
	public String applicationName() {
		return "Oi Mundo do Spring =D";
	}
	
	@Bean() //BEAN SEM NOME, SERA UTILIZADO O NOME DO METODO
	public String outraConfiguracao() {
		return "configurei outro Bean e puxei na minha main, uhuuuu";
	}
}
