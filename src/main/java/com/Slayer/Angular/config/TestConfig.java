package com.Slayer.Angular.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Slayer.Angular.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbServices;

	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String value;

	@Bean
	public void instanciaDB() {
		this.dbServices.instanciaDB();
	}
}
