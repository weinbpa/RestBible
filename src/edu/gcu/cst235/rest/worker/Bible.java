package edu.gcu.cst235.rest.worker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Found = " + searchAlice("Abraham"));
	}
	
	public static int searchAlice(String word) {
		File file = new File("/Users/twoply/Downloads/RestPractice/WebContent/kjvdat.txt");
		int count = 0;
		BufferedReader buff;
		try {
			 buff = new BufferedReader(new FileReader(file));

			String line;
			while((line = buff.readLine()) != null) {
				if (line.contains(word))
					count++;
			}
			buff.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}
