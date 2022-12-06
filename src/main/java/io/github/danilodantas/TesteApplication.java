package io.github.danilodantas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TesteApplication {
	
	@Autowired
	private MinhaConfiguration minhaconfig;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return minhaconfig.applicationName();
	}

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}
	

	
}
