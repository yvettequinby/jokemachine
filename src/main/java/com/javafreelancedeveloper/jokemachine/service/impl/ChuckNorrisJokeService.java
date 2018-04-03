package com.javafreelancedeveloper.jokemachine.service.impl;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import com.javafreelancedeveloper.jokemachine.service.JokeService;

public class ChuckNorrisJokeService implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public ChuckNorrisJokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
