package com.BookStoreApplication;

import java.util.List;

public interface BookService {
	public List<Book> getAllBooks();
	public Book addBook(Book book);
	public Book deleteBook(int id);
	public Book updateBook(int id, double price);
	public Book getBookById(int id);

}
