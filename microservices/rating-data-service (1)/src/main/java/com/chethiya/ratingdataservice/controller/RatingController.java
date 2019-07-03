package com.chethiya.ratingdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chethiya.ratingdataservice.model.RatinData;
import com.chethiya.ratingdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingdata")
public class RatingController {
	
	@RequestMapping("/{movieId}")
	public RatinData getRating(@PathVariable("/movieId") String movieId) {
		return new RatinData(movieId, 6);
		
		
	}
     
	@RequestMapping("user/{userId}")
	public UserRating getUserRating(@PathVariable("/userId") String userId) {
	List<RatinData> ratings = Arrays.asList(new RatinData("transformer", 6),
			new RatinData("Titanic", 4)
			
			);
	UserRating userRating = new UserRating();
	userRating.setUserRatin(ratings);
	return userRating;
		
	}
	
	
  
}
