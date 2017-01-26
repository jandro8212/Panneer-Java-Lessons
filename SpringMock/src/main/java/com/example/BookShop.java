package com.example;

import java.util.List;

public class BookShop {
	
	String name;
	String city;
	List<Book> listOfBooks;
	
	public BookShop(String name, String city) {
		this.name = name;
		this.city = city;
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
	
	public void setListOfBooks(List<Book> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	
	public List<Book> getListOfBooks() {
		return listOfBooks;
	}

}
