package com.example;

public class Adress {
	String region;
	String country;
	
	public Adress(String region, String country) {
		this.region = region;
		this.country = country;
	}
	
	public String getRegion(){
		return region;
	}
	public String getCountry(){
		return country;
	}

}
