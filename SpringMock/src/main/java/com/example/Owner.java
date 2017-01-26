package com.example;

public class Owner {
	String name;
	String city;
	BookShop bookshop;
	
	public Owner(String name, String city, BookShop bookshop) {
		this.name = name;
		this.city = city;
		this.bookshop = bookshop;
	}
	
	public BookShop getBookShop() {
		return bookshop;
	}
	public String getCity(){
		return city;
	}
	
	public String getName() {
		return name;
	}

}