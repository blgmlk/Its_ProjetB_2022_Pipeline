package com.compagny.myapp;

import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan
@EnableJpaRepositories
@EnableWebMvc
public class MyAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);

		Personne personne = new Personne("Doe", "John", LocalDate.of(1990, 1, 1), "1 rue de la paix");
	}
}
