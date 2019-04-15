package com.mia.ten.parse;

/* Headfirst Java p327 */
public class ParseString {

	public static void main(String[] args) {
		
		double d = 42.4;
		// String stringDoubleFail = d; : 숫자를 바로 String으로 할당하는 것은 불가능
		String stringDouble_1 = "" + d;
		String stringDouble_2 = Double.toString(d);
		
		System.out.println("double to String : " + stringDouble_1);
		System.out.println("double to String : " + stringDouble_2);
	}
}
