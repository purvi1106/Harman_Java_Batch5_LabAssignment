package Assignment_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("C:\\Users\\LENOVO\\Downloads\\books.txt");
			BufferedReader br=new BufferedReader(fr);
			
			String i=null;
			while ((i = br.readLine()) !=null) {
				 String tokens[]=i.split(":");
				 
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
