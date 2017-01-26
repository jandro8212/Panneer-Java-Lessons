package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller hay que ponerlo para que el programa sepa que es Bean
//entonces Spring busca los componentes y los registra el solo
@Controller 
@RequestMapping (path = "hello") // Mapping "hello"
public class HelloControler {
	
	//ModelMap is given to this controller  get method to set the data by Srping
	//Controller returns the view name ("hello") to Spring
	//Then Spring looks for a view with the name "hello" in the resources.
	//Once it finds the view with the name hello.html or hello.jap
	//Spring generates the actual html page with the help from thymeleaf+
	//it will make use of the ModelMap data to set the values in HTML page
	//Then HTML page is returned to the browser
	
	@GetMapping
	public String getMessage(ModelMap model) {
		System.out.println("Get Method");
		model.addAttribute("message", "Hello Spring MVC");
		
		return "hello"; //name of the view
	}

}