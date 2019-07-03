package com.chethiya.moviecatalogservice.model;

import java.util.List;

public class UserRating {
	
	public UserRating() {
		
	}

	private List<RatinData> userRatin;

	public UserRating(List<RatinData> userRatin) {
		super();
		this.userRatin = userRatin;
	}

	public List<RatinData> getUserRatin() {
		return userRatin;
	}

	public void setUserRatin(List<RatinData> userRatin) {
		this.userRatin = userRatin;
	}
	

}
