package Assignment3_Q5;

public class UserRegistrationMain {

	public static void main(String[] args) {
			UserRegistration registration=new UserRegistration();
			try {
				registration.registerUser("Alisha", "Russia");
			} catch (InvalidCountryException e) {
				System.out.println(e.getMessage());
			}
		}
	}
