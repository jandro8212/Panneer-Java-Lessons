package com.example;

public class Training {
	String courseName;
	String trainerName;
	
	public Training (String courseName, String trainerName) {
		this.courseName = courseName;
		this.trainerName = trainerName;
	}
	
	public String getCourseName(){
		return courseName;
	}
	public String getTrainerName(){
		return trainerName;
	}
	
}