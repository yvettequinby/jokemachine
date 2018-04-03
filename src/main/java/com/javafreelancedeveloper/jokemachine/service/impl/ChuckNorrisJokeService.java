package com.javafreelancedeveloper.jokemachine.service.impl;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafreelancedeveloper.jokemachine.service.JokeService;

@Service
public class ChuckNorrisJokeService implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	@Autowired
	public ChuckNorrisJokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
