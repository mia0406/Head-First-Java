package com.mia.ten.codemagnetic;

import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class FullMoons {
	
	static int DAY_IM = 1000 * 60 * 60 * 24;

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(2004,0,7,15,40);		
		
		long day1=c.getTimeInMillis();
		
		for(int x=0;x<3;x++) { 
			
			day1 += (DAY_IM * 29.52);
			c.setTimeInMillis(day1); // Calendar ��ü�� ���ο� ��¥ �߰�
			out.println(String.format("full moon on %tc", c));
		}
	}
}
