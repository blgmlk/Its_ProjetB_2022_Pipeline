package com.compagny.myapp;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
@EnableJpaRepositories
public class MyAppApplication {
	@Autowired
	PersonneRepository personneRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
		//ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

		Personne personne = new Personne("Doe", "John", LocalDate.of(1990, 1, 1), "1 rue de la paix");

		//PersonneRepository personneRepository = context.getBean(PersonneRepository.class);
		// personneRepository.saveAndFlush(personne);
	}
}
