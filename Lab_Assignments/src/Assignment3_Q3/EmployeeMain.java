package Assignment3_Q3;

	import java.io.*;

	public class EmployeeMain {

		public static void main(String[] args) {

			Address address=new Address("A134, Kamal vihar", "Raipur", "India");
			Employee employee=new Employee(121, "Varun", address, 400000);
			
			//Serilization
			try {
				ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("temp.ser")));
				oos.writeObject(employee);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Deserilization
			employee=null;
			try {
				ObjectInputStream oos=new ObjectInputStream(new FileInputStream(new File("temp.ser")));
				employee=(Employee) oos.readObject();
				System.out.println(employee);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			
		}
	}







