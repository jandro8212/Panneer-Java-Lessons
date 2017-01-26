package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "students")
@Scope (value = "session")
public class StudentController {
	
	StudentRepostory repository;
	
	@Autowired
	public StudentController(StudentRepostory repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public @ResponseBody List<Student> getStudents() {
		return repository.getStudents();

	}
	
	@PostMapping
	public @ResponseBody List<Student> addStudent (@ModelAttribute ("Springweb")Student student) {
		repository.addStudents(student);
		return repository.getStudents();
	}

}