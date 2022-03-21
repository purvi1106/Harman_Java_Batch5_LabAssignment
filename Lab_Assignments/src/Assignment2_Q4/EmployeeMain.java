package Assignment2_Q4;

public class EmployeeMain {

		public static void main(String[] args) {
			Employee employee=new
					CommissionEmployee(11, "Aditya", 4.5, 7000000);
			System.out.println(employee.getPayment());
		}
	}

