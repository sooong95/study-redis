package com.example.redis_in_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class RedisInSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisInSpringApplication.class, args);
	}

}
