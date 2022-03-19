package Assignment_3;

import java.io.*;


public class Player2 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\LENOVO\\Downloads\\dhoni.jpg")));
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\LENOVO\\Documents\\dhoni.jpg")));
			int i;
			while ((i = br.read()) != -1) {
				System.out.println((char) i);
				bw.write(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time taken : " + (end - start) + " ms");
	}

}
