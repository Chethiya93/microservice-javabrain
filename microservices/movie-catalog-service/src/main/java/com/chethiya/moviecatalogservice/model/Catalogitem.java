package com.chethiya.moviecatalogservice.model;

public class Catalogitem {
	
	private String name;
	private String desc;
	private Integer rate;
	
	
	
	public Catalogitem() {
	
	}



	public Catalogitem(String name, String desc, Integer rate) {
		super();
		this.name = name;
		this.desc = desc;
		this.rate = rate;
	}
	
	
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}


}
