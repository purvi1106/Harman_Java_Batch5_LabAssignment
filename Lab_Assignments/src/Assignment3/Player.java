package Assignment3;

import java.io.*;

public class Player {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {

			// FileInputStream fis=new
			// FileInputStream("C:\\Users\\LENOVO\\Downloads\\virat.jpg");
			// FileOutputStream fos=new
			// FileOutputStream("C:\\Users\\LENOVO\\Documents\\virat.txt");

			FileReader fr = new FileReader("C:\\Users\\LENOVO\\Downloads\\virat.jpg");
			FileWriter fw = new FileWriter("C:\\Users\\LENOVO\\Documents\\virat.jpg");
			int i;
			while ((i = fr.read()) != -1) {
				System.out.println((char) i);
				fw.write(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time taken : " + (end - start) + " ms");
	}
}
