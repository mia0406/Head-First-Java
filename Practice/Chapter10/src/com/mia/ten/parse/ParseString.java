package com.mia.ten.parse;

/* Headfirst Java p327 */
public class ParseString {

	public static void main(String[] args) {
		
		double d = 42.4;
		// String stringDoubleFail = d; : ���ڸ� �ٷ� String���� �Ҵ��ϴ� ���� �Ұ���
		String stringDouble_1 = "" + d;
		String stringDouble_2 = Double.toString(d);
		
		System.out.println("double to String : " + stringDouble_1);
		System.out.println("double to String : " + stringDouble_2);
	}
}
