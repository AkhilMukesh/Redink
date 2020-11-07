package com.assesment.redink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = { "com.assesment.redink.entity"})
@EnableJpaRepositories("com.assesment.redink.repository")
@ComponentScan(basePackages = { "com.assesment.redink.controller","com.assesment.redink.service",
		"com.assesment.redink.repository"})
@EnableAutoConfiguration
public class RedinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedinkApplication.class, args);
	}

}
