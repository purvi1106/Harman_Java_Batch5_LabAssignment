package Assignment3_Q5;

public class UserRegistration {	
		public void registerUser(String username,String userCountry)
				throws InvalidCountryException {
			if(userCountry.equals("India")) {
				System.out.println("Successful registration of user");
			}else
				throw new InvalidCountryException("Invalid country name : "+
			userCountry+" Please Provide India");
		}
	}


