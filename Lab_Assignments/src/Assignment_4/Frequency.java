package Assignment_4;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> freqmap = new HashMap<>();
		try {
			File f=new File("story.txt");
			String path=f.getAbsolutePath();
			BufferedReader br = new BufferedReader(new FileReader(path));
			String i;
			while ((i = br.readLine()) != null) {
				String token[] = i.split(" ");
				for (String temp : token) {
					if (freqmap.containsKey(temp)) {
						int freq = freqmap.get(temp);
						freqmap.put(temp, ++freq);
					} else {
						freqmap.put(temp, 1);
					}

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Set<Entry<String, Integer>> entrySet = freqmap.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
