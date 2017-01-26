package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringCongig {
	
	@Bean
	public Adress adress() {
		Adress adress = new Adress("Valencia", "España");
		return adress;
	}
	@Bean
	public Training training() {
		Training training = new Training("JAVA", "Panneer");
		return training;
	}
	@Bean
	@Scope(value = "prototype")
	public Student student() {
		Student student = new Student("Alejandro", 26, training());
		
		List<String> subjects = new ArrayList<String>();
		subjects.add("Matemáticas");
		subjects.add("Física");
		Map<String, Double> marks = new HashMap<String, Double>();
		marks.put("Matemáticas", 9.8);
		marks.put("Física", 5.03);
		student.setAdress(adress());
		student.setCity("Yátova");
		student.setSubjects(subjects);
		student.setMarks(marks);
		return student;
	}

}