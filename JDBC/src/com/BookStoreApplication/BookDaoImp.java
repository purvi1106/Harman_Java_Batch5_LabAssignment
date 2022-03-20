package com.BookStoreApplication;

import java.sql.*;
import java.util.*;

public class BookDaoImp implements BookDao {
	private Connection con;

	public BookDaoImp() {
		con = DatabaseConnection.GetConnection();
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		Book tempbook;
		try {
			String get_all_query = "select * from books";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(get_all_query);
			while (rs.next()) {
				tempbook = new Book(rs.getInt("id"), rs.getString("title"), rs.getString("author"), rs.getInt("price"));
				books.add(tempbook);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return books;
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		try {
			String add_query="insert into books(id,title,author,price) values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(add_query, Statement.RETURN_GENERATED_KEYS);
		ps.setInt(1, book.getId());
		ps.setString(2, book.getTitle());
		ps.setString(3, book.getAuthor());
		ps.setDouble(4, book.getPrice());
		
		int noOfRowsEffected=ps.executeUpdate();
		
		if(noOfRowsEffected>0) {
			ResultSet rs=ps.getGeneratedKeys();
			rs.next();
			book.setId(rs.getInt(1));
		}	
	} catch (SQLException ex) {
		ex.printStackTrace();
	}
	
	return book;
}

	@Override
	public Book deleteBook(int id) {
		// TODO Auto-generated method stub
		Book bookToBeDeleted = getBookById(id);
		try {
			String delete_book_by_id="delete from books where id=?";
			PreparedStatement ps= con.prepareStatement(delete_book_by_id);
			ps.setInt(1, id);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookToBeDeleted;
	}

	@Override
	public Book updateBook(int id, Double price) {
		// TODO Auto-generated method stub
Book bookToBeUpdated = getBookById(id);
		
		try {
			String update_book_query=
			"update books set price=? where id=?";
			PreparedStatement ps=con.prepareStatement(update_book_query);
			ps.setDouble(1, price);
			ps.setInt(2, id);
			int noOfRowsEffected=ps.executeUpdate();
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		bookToBeUpdated.setPrice(price);
		return bookToBeUpdated;
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		Book book=null;
		try {
			String get_book_by_id="select * from books where id=?";
			PreparedStatement pstmt= con.prepareStatement(get_book_by_id);
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				book=new Book(rs.getInt("id"),rs.getString("title"),
						rs.getString("author"), rs.getDouble("price"));
			}else {
				throw new BookNotFoundException("Book with id "+ id +" is not found in the table");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return book;
	}

}
