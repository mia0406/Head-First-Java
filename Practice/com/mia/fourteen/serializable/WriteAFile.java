package com.mia.fourteen.serializable;

import java.io.*;

public class WriteAFile {
	
	public static void main(String[] args) {
	
		try {
			
			FileWriter writer = new FileWriter("C:\\\\\\\\Mia\\\\\\\\test\\\\\\\\sampleFile.txt");
			writer.write("hello World!");
			writer.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
