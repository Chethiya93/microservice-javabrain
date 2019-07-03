package com.chethiya.moviecatalogservice.model;

public class RatinData {
	
	private String movieID;
	private Integer rate;
	
	
	
	
	
	public RatinData() {
		
	}


	public RatinData(String movieID, Integer rate) {
		super();
		this.movieID = movieID;
		this.rate = rate;
	}
	
	
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	
	
	

}
