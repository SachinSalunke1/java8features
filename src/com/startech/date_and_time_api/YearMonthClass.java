package com.startech.date_and_time_api;

import java.time.Month;
import java.time.YearMonth;

public class YearMonthClass {

	public static void main(String[] args) {
		YearMonth date1 = YearMonth.now();
		System.out.println(date1 + " :" + date1.lengthOfMonth());
		System.out.printf("%s :%d%n", date1, date1.lengthOfMonth());		
		System.out.println("----------------------------------------");
		
		YearMonth date2 = YearMonth.of(1985, Month.FEBRUARY);
		System.out.println(date2 + " :" + date2.lengthOfMonth());
		System.out.printf("%s :%d%n", date2, date2.lengthOfMonth());
		System.out.println("----------------------------------------");
		
		YearMonth date3 = YearMonth.of(1988, Month.FEBRUARY);
		System.out.println(date3 + " :" + date3.lengthOfMonth());
		System.out.printf("%s :%d%n", date3, date3.lengthOfMonth());
		System.out.println("----------------------------------------");
		
		
	}

}
