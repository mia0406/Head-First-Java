package com.mia.ten.format;

import java.util.Date;

public class Format {

	public static void main(String[] args) {
		
		int one=20456;
		double two=100567.2489;
		
		String s = String.format("The rank is %,d out of %,.2f", one, two);
		
		System.out.println(s);
		
		String dateTime = String.format("%tc", new Date());
		System.out.println(dateTime);
		
		String time = String.format("%tr", new Date());
		System.out.println(time);

		Date today = new Date();
		String seperateDate = String.format("%tA. %tB. %td", today, today, today); 
		// 출력은 가능하지만 내가 써보기에는 번거롭다.
		System.out.println(seperateDate);
		
		String sss = String.format("%tA, %<tB, %<td", today);
		System.out.println(sss);
	}
}
