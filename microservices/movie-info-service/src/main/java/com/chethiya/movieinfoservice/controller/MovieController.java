package com.chethiya.movieinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chethiya.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	
	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId")String movieId)
	{
		return new Movie(movieId, "Titanic");
	}

}
