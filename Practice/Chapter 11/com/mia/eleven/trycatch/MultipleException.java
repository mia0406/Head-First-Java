package com.mia.eleven.trycatch;

import java.io.IOException;
import java.sql.SQLException;

/* �ϳ��� method�� ���� ���� Exception�� ������ �� �ִ�. */
public class MultipleException {

	public void throwExceptions(int data) throws SQLException, IOException{ // , �̿��Ͽ� ���� ���� Exception ����
		
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
