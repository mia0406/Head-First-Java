package com.mia.eleven.trycatch;

public class GenerateException {

	public void takeRisk() throws Exception{
		
		throw new Exception(); // Exception�� ������(�����)�� ���Ƿ� ������ �� ���
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
