package com.example;

public class Book {
	
	String bookName;
	String authorName;
	
	public Book (String bookName, String authorName) {
		this.authorName = authorName;
		this.bookName = bookName;
	}
	
	public String getBookName(){
		return bookName;
	}
	public String getAuthorName(){
		return authorName;
	}
}