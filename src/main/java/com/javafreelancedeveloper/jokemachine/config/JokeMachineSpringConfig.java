package com.javafreelancedeveloper.jokemachine.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javafreelancedeveloper.jokemachine.service.impl.ChuckNorrisJokeService;

@Configuration
public class JokeMachineSpringConfig {
	
	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
	
	@Bean
	public ChuckNorrisJokeService chuckNorrisJokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
		return new ChuckNorrisJokeService(chuckNorrisQuotes);
	}

}
