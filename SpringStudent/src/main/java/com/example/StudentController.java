package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (path = "students")
public class StudentController {
	
	StudentRepostory repository;
	
	@Autowired
	public StudentController(StudentRepostory repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public String getStudents(ModelMap model) {
		// Check if the list is not empty
		if (repository.getStudents().size() != 0){ 
			Student s = repository.getStudents().get(0);
			if (s != null){ //Do null check to avoid Null Pointer Exception
				String name = s.getName();
				String city = s.getCity();
				
				model.addAttribute("size", repository.getStudents().size());
				model.addAttribute("name", name);
				model.addAttribute("city", city);
				}
		} else {
			model.addAttribute("size", repository.getStudents().size());
			model.addAttribute("name", "No name available");
			model.addAttribute("city", "No city available");
		}
		return "student"; //view name
	}
	
	@PostMapping
	public String addStudent (@ModelAttribute ("Springweb")Student student, ModelMap model) {
		System.out.println("Add Student");
		repository.addStudents(student);
		
		model.addAttribute("size", repository.getStudents().size());
		model.addAttribute("name", student.getName());
		model.addAttribute("city", student.getCity());
		
		return "student";
		
	}

}