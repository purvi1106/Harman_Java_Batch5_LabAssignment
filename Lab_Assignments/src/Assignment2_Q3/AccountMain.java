package Assignment2_Q3;

public class AccountMain {
	public static void main(String[] args) {

		Account account = new SavingsAccount("Bhavesh", "4562781", 40000, 5, 1000);

		Account account2 = new CurrentAccount("Varun", "5435464325", 900000, "AB1234", 50000);
		account.withdraw(3460);
	}
}
