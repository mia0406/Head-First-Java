package com.mia.eleven.trycatch;

import java.io.IOException;
import java.sql.SQLException;

/* 하나의 method에 여러 개의 Exception을 선언할 수 있다. */
public class MultipleException {

	public void throwExceptions(int data) throws SQLException, IOException{ // , 이용하여 여러 개의 Exception 선언
		
		if(data == 1) {
			
			throw new SQLException();
		}
		else {
			
			throw new IOException();
		}
	}
	
	public static void main(String[] args) {
	
		MultipleException me = new MultipleException();
		int data = 2;
		
		try {
			me.throwExceptions(data);
		} catch(SQLException se) {
			System.out.println("SQLException-----");
			se.printStackTrace();
		} catch(IOException ie) {
			System.out.println("IOException-----");
			ie.printStackTrace();
		}
	}
}
