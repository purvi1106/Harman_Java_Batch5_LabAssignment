package com.BookStoreApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static  Connection GetConnection()  {
		Connection con = null;

		String url = "jdbc:mysql://localhost:3306/book";
		String username = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);

			System.out.println("Connected!");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return con;
	}
	public static void main(String[] args) {
		System.out.println("Connected!");
	}

}
