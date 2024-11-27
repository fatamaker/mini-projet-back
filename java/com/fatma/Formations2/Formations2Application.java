package com.fatma.Formations2;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.fatma.Formations2.entities.Formation;
import com.fatma.Formations2.entities.Theme;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.fatma.Formations2.repos")
public class Formations2Application implements CommandLineRunner {
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(Formations2Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Formation.class,Theme.class);
	}
	
	
	
	


}


