package com.javafreelancedeveloper.jokemachine.service.impl;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import org.springframework.stereotype.Service;

import com.javafreelancedeveloper.jokemachine.service.JokeService;

@Service
public class ChuckNorrisJokeService implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public ChuckNorrisJokeService() {
		chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
