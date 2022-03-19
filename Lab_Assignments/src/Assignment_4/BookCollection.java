package Assignment_4;

import java.util.*;
import java.io.*;
public class BookCollection{
			 private String ownerName;
			private List<Book> books;
			
			public BookCollection(String ownerName) 
			{
				this.ownerName = ownerName;
				this.books=new ArrayList<Book>();
				init();
			}
			private void init() {
				books.add(new Book(1, "Java", "Author1"));
				books.add(new Book(123, "STL in C++", "Author2"));
				books.add(new Book(178, "Introduction to Python", "Author3"));
			}
			
			public boolean hasBook(String b) {
				//int index=Collections.indexedBinarySearch(books,b,new Book());
			for(Book temp: books) {
				if(books.contains(b)) {
					return true;
				}
			}
				return false;
	 }
			public void SortBook() {
				Collections.sort(this.books,Collections.reverseOrder());
				System.out.println(this.books);
			}
}
