package Assignment4;

import java.io.*;

import java.util.*;

public class DataFile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> arr=new ArrayList<Double>();
		try {
			File f=new File("data.txt");
			String path=f.getAbsolutePath();
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			double i;
			while ((line = br.readLine()) != null) {
				i=Double.parseDouble(line);
				arr.add(i);
			}
			double greatest=arr.get(0);
			int index=1;
			while(index<arr.size()) {
				if(arr.get(index)> greatest) {
					greatest=arr.get(index);
					index++;
				}
				index++; 
			}
			System.out.println("Greatest Number is:"+greatest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
