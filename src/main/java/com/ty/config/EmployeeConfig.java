package com.ty.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"com.ty"})
@EnableWebMvc
public class EmployeeConfig {
	@Bean
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employee");
		return entityManagerFactory.createEntityManager();
	}

}