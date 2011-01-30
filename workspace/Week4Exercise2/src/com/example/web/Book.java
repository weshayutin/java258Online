package com.example.web;

public class Book {
	
	String authorName;
	String bookName;
	String emailAddress;
	
	public Book(String bookName, String authorName, String emailAddress){
		this.bookName = bookName;
		this.authorName = authorName;
		this.emailAddress = emailAddress;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	public String getBookName() {
		return bookName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}

	
}
