package com.mia.ten.calendar;

import java.util.Calendar;

public class JavaCalendar {

	public static void main(String[] args) {
		
		// java.util.Calendar는 이렇게 사용 X
		//Calendar cal = new Calendar(); 
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2019, 2, 7, 16, 30); // 2번째는 달을 뜻하는데 달은 0부터 시작
		System.out.println("original Calendar " + cal.getTime());
		
		long day1 = cal.getTimeInMillis(); // 1970년 1월 1일부터 경과한 시간을 밀리초 단위로 표현한 값 리턴
		day1 += 1000*60*60;
		cal.setTimeInMillis(day1); // 시간 갱신
		System.out.println("new hour " + cal.get(cal.HOUR_OF_DAY));
		
		cal.add(cal.DATE, 35);
		System.out.println("add 35 days " + cal.getTime());
		
		cal.roll(cal.DATE, 35);
		System.out.println("roll 35 days " + cal.getTime()); // 일에만 35일을 더하는 거지, 월/년/시간 등에는 영향 주지 X
		
		cal.set(cal.DATE, 1);
		System.out.println("set to 1 " + cal.getTime());
		
		// get(int field) 메소드 사용하여 필드값 return
		System.out.println(cal.get(cal.MONTH));
		
	}
}
