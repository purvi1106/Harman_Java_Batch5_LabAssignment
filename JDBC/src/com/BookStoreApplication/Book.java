package com.BookStoreApplication;

public class Book {
	private int id;
	private String title;
	private String author;
	private double price;
	
	//Getter Setter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	// Default Constructor
	public Book() {	
	}

	//Parameterized Constructor
	public Book(int id,String title,String author,double price) {
		id=this.id;
		title=this.title;
		author=this.author;
		price=this.price;
	}

}
