package com.mia.ten.autoboxing;

/* Headfirst Java p325 */
public class TextBox {
	
	Integer i;
	int j;
	
	public static void main(String[] args) {
	
		TextBox t = new TextBox();
		t.go();
	}
	
	public void go() {
		
		// j=i; // NullpointerException 발생
		// i=j; : 문제없이 작동, 둘 다 0으로 출력
		System.out.println(j);
		System.out.println(i);
	}
}
