package com.mia.fourteen.fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadAFile {

	public static void main(String[] args) {
		
		try {
			
			File myFile = new File("C:\\Mia\\test\\file.txt");
			FileReader fileReader = new FileReader(myFile);
			
			BufferedReader reader = new BufferedReader(fileReader);
			
			String line = null;
			while((line = reader.readLine()) != null) {
				
				System.out.println(line);
			}
			
			reader.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
