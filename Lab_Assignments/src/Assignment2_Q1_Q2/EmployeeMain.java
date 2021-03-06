package Assignment2_Q1_Q2;

// ASSIGNMENT 2 QUESTION 1

 class Employee {
	private int id, salary;
	private String firstName, lastName;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return this.id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getSalary() {
		return this.salary;
	}

	public String getName() {
		return this.firstName + " " + lastName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return this.salary * 12;
	}

	public int raiseSalary(int percent) {

		return (this.salary) + (salary * percent / 100);
	}
	
	@Override
	public String toString(){
		return "Employee[Id= "+id+",name= "+this.firstName+" "+this.lastName+",salary= "+this.salary+"]";
		
	}
}
public class EmployeeMain{
public static void main(String[]args) {
	Employee em=new Employee(23, "Ravi", "Malhotra", 230000);
	
	System.out.println(em.toString());
	System.out.println("Raised Salary="+em.raiseSalary(20));
}
}
