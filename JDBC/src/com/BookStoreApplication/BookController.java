package com.BookStoreApplication;

import java.util.List;

public class BookController {
	public static void main(String[] args) {
		BookService dao = new BookServiceImp();
		List<Book> books = dao.getAllBooks();
		for(Book temp:books){
			System.out.println(temp.toString());
		}
			   // dao.deleteBook(126);
	}

}
