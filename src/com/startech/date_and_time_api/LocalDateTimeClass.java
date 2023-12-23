package com.startech.date_and_time_api;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeClass {
	// The LocalDateTime is used to represent a combination of date and time.

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());

		// he below code samples explain how to create an instance using the factory
		// “of” and “parse” methods. The result would be a LocalDateTime instance
		// representing 20 February 2015, 06:30 AM:
		System.out.println(LocalDateTime.of(2015, Month.AUGUST, 07, 17, 05));
		System.out.println(LocalDateTime.parse("2015-08-07T17:05"));

		// Adding days, substract and getting month examples.
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.plusDays(1));
		System.out.println(now.minusHours(2));
		System.out.println(now.getMonth());
	}

}
