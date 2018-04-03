package com.javafreelancedeveloper.jokemachine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javafreelancedeveloper.jokemachine.service.JokeService;

@Controller
public class JokeController {
	
	private JokeService jokeService;
	
	@Autowired
	public JokeController(@Qualifier("chuckNorrisJokeService")JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		String theJoke = jokeService.getJoke();
		model.addAttribute("joke", theJoke);
		return "joke";
	}

}
