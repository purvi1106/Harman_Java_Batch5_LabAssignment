package Assignment2_Q1_Q2;

public class BookStore {
	private Book[] books;

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public BookStore() {
		this.books = new Book[10];
		assignBooks();
	}

	// Assign method to put books in array
	private void assignBooks() {
		// TODO Auto-generated method stub
		books[0] = new Book("Book1","Author 1","1234",50);
		books[1] = new Book("Book2","Author 2","12345",150);
		books[2] = new Book("Book3","Author 3","123456",250);
		books[3] = new Book("Book4","Author 4","1234567",350);
		books[4] = new Book("Book5","Author 5","12345678",450);
		books[5] = new Book("Book6","Author 6","1234521",50);
		books[6] = new Book("Book7","Author 7","12345675",150);
		books[7] = new Book("Book8","Author 8","12345690",250);
		books[8] = new Book("Book9","Author 9","123456786",350);
		books[9] = new Book("Book10","Author 10","1234567894",450);
	}

//Sell Method
	void sell(String bookTitle, int numofCopies) {
		boolean check = false;
		for (int i = 0; i < 10; i++) {
			if (books[i].getBookTitle() == bookTitle) {
				books[i].setNumofCopies(books[i].getNumofCopies()-numofCopies);
				check = true;
			}
		}
		if (!check) {
			System.out.println("Book Not Found..");
		}
	}

//Order Method
	void order(String ISBN, int numofCopies) {
		boolean check = false;
		for (int i = 0; i < 10; i++) {
			if (books[i].getISBN() == ISBN) {
				books[i].setNumofCopies(books[i].getNumofCopies() + numofCopies);
				check = true;
			}
		}
		if (!check) {
			int len = books.length;
			books[len + 1] = new Book(ISBN, null, null, numofCopies);
		}
	}
void display() {
	for(Book temp:this.getBooks()) {
		temp.display();
	}
}

}
