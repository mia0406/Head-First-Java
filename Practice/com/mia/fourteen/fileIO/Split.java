package com.mia.fourteen.fileIO;

public class Split {

	public static void main(String[] args) {
	
		String toTest = "What is blue + yellow?/green";
		String[] result = toTest.split("/");
		
		for(String token:result) {
		
			System.out.println(token);
		}
	}
}
