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
		
		// j=i; // NullpointerException �߻�
		// i=j; : �������� �۵�, �� �� 0���� ���
		System.out.println(j);
		System.out.println(i);
	}
}
