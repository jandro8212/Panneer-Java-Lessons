package com.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemo2Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/Beans.xml");
		
		Student student = (Student) context.getBean("student");
		System.out.println("Student Name: " + student.getName());
		System.out.println("Student Age: " + student.getAge());
		System.out.println("Student City: " + student.getCity());
		
		System.out.println("Student Trainer: " + student.getTraining().getTrainerName());
		System.out.println("Student Course: " + student.getTraining().getCourseName() );
		
		System.out.println("Student Region: " + student.getAdress().getRegion());
		System.out.println("Student Country: " + student.getAdress().getCountry());
		
		List<String> subjects = student.getSubjects();
		for (String subject : subjects)
			System.out.println("Subject: " + subject);
		
		Map<String, Double> marks = student.getMarks();
		Set<String> marks2 = marks.keySet();
		for (String mark : marks2) {
			System.out.println("La asginatura es " + mark + " y la nota es " + marks.get(mark));
		}
			
		Student student2 = (Student) context.getBean("student");
		
		if(student == student2) { // Singleton scope
			System.out.println("Los dos Beans son iguales");
		} else { // Prototype scope
			System.out.println("Los Beans son distintos");
		}
		
		//Bean lifecycle
		
		context.close();
	}
}