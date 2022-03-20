package com.BookStoreApplication;

import java.util.*;

public interface BookDao {
	public List<Book> getAllBooks();
	public Book addBook(Book book);
	public Book deleteBook(int id) ;
	public Book updateBook(int id, Double price) ;
	public Book getBookById(int id) ;

}
