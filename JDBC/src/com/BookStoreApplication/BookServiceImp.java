package com.BookStoreApplication;

import java.util.List;

public class BookServiceImp implements BookService{

	private BookDao bookDao;
	
	public BookServiceImp() {
		bookDao=new BookDaoImp();
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public Book addBook(Book book) {
		return bookDao.addBook(book);
	}

	@Override
	public Book deleteBook(int id) {
		return bookDao.deleteBook(id);
	}

	@Override
	public Book updateBook(int id, double price) {
		return bookDao.updateBook(id, price);
	}

	@Override
	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

}

