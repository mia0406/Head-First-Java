package com.mia.ten.calendar;

import java.util.Calendar;

public class JavaCalendar {

	public static void main(String[] args) {
		
		// java.util.Calendar�� �̷��� ��� X
		//Calendar cal = new Calendar(); 
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2019, 2, 7, 16, 30); // 2��°�� ���� ���ϴµ� ���� 0���� ����
		System.out.println("original Calendar " + cal.getTime());
		
		long day1 = cal.getTimeInMillis(); // 1970�� 1�� 1�Ϻ��� ����� �ð��� �и��� ������ ǥ���� �� ����
		day1 += 1000*60*60;
		cal.setTimeInMillis(day1); // �ð� ����
		System.out.println("new hour " + cal.get(cal.HOUR_OF_DAY));
		
		cal.add(cal.DATE, 35);
		System.out.println("add 35 days " + cal.getTime());
		
		cal.roll(cal.DATE, 35);
		System.out.println("roll 35 days " + cal.getTime()); // �Ͽ��� 35���� ���ϴ� ����, ��/��/�ð� ��� ���� ���� X
		
		cal.set(cal.DATE, 1);
		System.out.println("set to 1 " + cal.getTime());
		
		// get(int field) �޼ҵ� ����Ͽ� �ʵ尪 return
		System.out.println(cal.get(cal.MONTH));
		
	}
}
