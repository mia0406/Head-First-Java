package com.mia.eleven.trycatch;

public class GenerateException {

	public void takeRisk() throws Exception{
		
		throw new Exception(); // Exception을 개발자(사용자)가 임의로 던져줄 때 사용
	}
	
	public static void main(String[] args) {
		
		GenerateException ge = new GenerateException();
		
		try {
			
			ge.takeRisk();
			
		} catch(Exception e) {
			System.out.println("Exception occur------");
			e.printStackTrace();
		}
	}
}
