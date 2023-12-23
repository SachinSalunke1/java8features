package com.startech.date_and_time_api;

import java.time.Month;
import java.time.MonthDay;

public class MonthDayClass {

	public static void main(String[] args) {
		MonthDay date = MonthDay.of(Month.FEBRUARY, 29);
		System.out.println(date);
		boolean validYear = date.isValidYear(2019);
		System.out.println(validYear);
	}

}
