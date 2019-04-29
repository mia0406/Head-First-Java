package com.mia.eleven.trycatch;

import java.io.IOException;
import java.sql.SQLException;

/* ������ ������ */
public class ExceptionPolymorphism {

	// ClassCastException(����) < RuntimeException < Exception(���� ����) ������ ��� ���踦 ������ �ִ�. 
	public void throwExceptions(int data) throws ClassCastException, RuntimeException ,Exception{
		
		if(data == 1) {
			
			throw new ClassCastException();
		}
		else if(data == 2) {
			
			throw new RuntimeException();
		}
		else {
			
			throw new Exception();
		}
	}
	
	public static void main(String[] args) {
	
		ExceptionPolymorphism me = new ExceptionPolymorphism();
		int data = 3;
		
		try {
			me.throwExceptions(data);
		
		// catch������ exception�� ������ �� ��� ���迡�� ���� �� ���� ������ ������ ���߾� �ۼ��ؾ� �Ѵ�.
		} catch(ClassCastException cce) {
			System.out.println("ClassCastException-----");
			cce.printStackTrace();
		} catch(RuntimeException re) {
			System.out.println("RuntimeException-----");
			re.printStackTrace();
		} catch(Exception e) {
			System.out.println("Exception-----");
			e.printStackTrace();
		}
	}
}
