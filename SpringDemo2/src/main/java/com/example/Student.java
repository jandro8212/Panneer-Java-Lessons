package com.example;

import java.util.List;
import java.util.Map;

public class Student {
	
	String name;
	int age;
	String city;
	Training training;
	Adress adress;
	List<String> subjects;
	Map<String, Double> marks; 
	
	//Constructor injection
	public Student(String name, int age, Training training){
		this.age = age;
		this.name = name;
		this.training = training;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity(){
		return city;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Training getTraining() {
		return training;
	}
	
	// Setter Injection with reference values
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	public Adress getAdress() {
		return adress;
	}
	
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	public List<String> getSubjects() {
		return subjects;
	}
	
	public void setMarks(Map<String, Double> marks) {
		this.marks = marks;
	}
	
	public Map<String, Double> getMarks() {
		return marks;
	}
	
	public void initBean(){
		System.out.println("Este es el Inicio del Bean");
	}
	
	public void destroyBean(){
		System.out.println("Este es el Final del Bean");
	}
}