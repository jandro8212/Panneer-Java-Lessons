package com.example;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringMockApplication {

	public static void main(String[] args) {
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/Beans.xml");
		
		Owner owner = (Owner) context.getBean("owner");
		System.out.println("Owner's Name: " + owner.getName());
		System.out.println("Owner's City: " + owner.getCity());
		System.out.println("Book Shop City: " + owner.getBookShop().city);
		System.out.println("Book Shop Name: " + owner.getBookShop().name);
	
		List<Book> books = owner.getBookShop().getListOfBooks();
		for (Book book :books) {
			System.out.println("Author: " + book.getAuthorName());
			System.out.println("Book Name: " + book.getBookName());
		}
		context.close();
	}
	
}