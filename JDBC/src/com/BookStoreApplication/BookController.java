package com.BookStoreApplication;

import java.util.List;

public class BookController {
	public static void main(String[] args) {
		BookService dao = new BookServiceImp();
		List<Book> books = dao.getAllBooks();
		books.forEach(b -> System.out.println(b));
	}

}
