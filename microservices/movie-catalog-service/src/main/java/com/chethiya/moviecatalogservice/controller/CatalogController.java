package com.chethiya.moviecatalogservice.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.chethiya.moviecatalogservice.model.Catalogitem;
import com.chethiya.moviecatalogservice.model.Movie;
import com.chethiya.moviecatalogservice.model.RatinData;
import com.chethiya.moviecatalogservice.model.UserRating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
	
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@RequestMapping(value="/{userId}")
	public List<Catalogitem> getCatalogItem(@PathVariable("userId")String userId )
	{ 
			
		UserRating ratin = restTemplate.getForObject
				("http://Rating-Data/ratingdata/user"+userId,UserRating.class);
				
//		
//	return	ratings.getUserRatin().stream().map(rating -> {
//		Movie movie=restTemplate.getForObject("http://localhost:8081/movie/foo"+rating.getMovieID(), Movie.class);
//		
//		return new Catalogitem(movie.getName(), "desc",rating.getRate());
//		})
//		.collect(Collectors.toList());
		
		return ratin .getUserRatin().stream().map(rating -> {
	 	
		
		
  Movie movie =restTemplate.getForObject("http://movie-info-service/movie"+rating.getMovieID(), Movie.class);
		  
		  return new Catalogitem(movie.getName(), "desc",rating.getRate());
		}).collect(Collectors.toList());
		
		  
		  
	}

}
