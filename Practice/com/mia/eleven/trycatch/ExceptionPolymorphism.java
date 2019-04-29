package com.mia.eleven.trycatch;

import java.io.IOException;
import java.sql.SQLException;

/* 예외의 다형성 */
public class ExceptionPolymorphism {

	// ClassCastException(하위) < RuntimeException < Exception(가장 상위) 순으로 상속 관계를 가지고 있다. 
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
		
		// catch문에서 exception을 선언할 때 상속 관계에서 하위 → 상위 순으로 순서를 맞추어 작성해야 한다.
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
