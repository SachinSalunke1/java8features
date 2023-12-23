package com.startech.date_and_time_api;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeClass {

	public static LocalTime getLocalTimeUsingFactoryOfMethod(int hour, int min, int seconds) {
		return LocalTime.of(hour, min, seconds);

	}
	
	private static LocalTime getLocalTimeUsingParseMethod(String timeRepresentation) {
		return LocalTime.parse(timeRepresentation);
	}

	public static void main(String[] args) {

		// An instance of current LocalTime can be created from the system clock as
		// below:
		LocalTime time = LocalTime.now();
		System.out.println(time);

		// LocalTime representing 06:30 AM by parsing a string representation:
		LocalTime sixThirty = LocalTime.parse("06:30");
		System.out.println(sixThirty);

		// The Factory method “of” can be used to create a LocalTime.
		LocalTime sevenThirty = LocalTime.of(7, 30);
		System.out.println(sevenThirty);

		// The below example creates a LocalTime by parsing a string and adds an hour to
		// it by using the “plus” API.
		// The result would be LocalTime representing 07:30 AM:
		LocalTime sevenThirty1 = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
		LocalTime sevenForty2 = LocalTime.parse("06:30").plus(70, ChronoUnit.MINUTES);
		System.out.println(sevenThirty1);
		System.out.println(sevenForty2);

		// Various getter methods are available which can be used to get specific units
		// of time like hour, min and secs
		int hours = LocalTime.parse("06:30").getHour();
		int minutes = LocalTime.parse("06:30").getMinute();
		System.out.println(hours);
		System.out.println(minutes);

		// We can also check if a specific time is before or after another specific
		// time.
		boolean isBefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
		System.out.println(isBefore);

		// The max, min and noon time of a day can be obtained by constants in LocalTime
		// class.
		// This is very useful when performing database queries to find records within a
		// given span of time.
		LocalTime max = LocalTime.MAX;
		LocalTime min = LocalTime.MIN;
		LocalTime noon = LocalTime.NOON;
		LocalTime midnight = LocalTime.MIDNIGHT;
		System.out.println(min);
		System.out.println(max);
		System.out.println(noon);
		System.out.println(midnight);
		System.out.println("-------------------------------------------------");
		System.out.println(getLocalTimeUsingFactoryOfMethod(5, 58, 45));
		System.out.println(getLocalTimeUsingParseMethod("06:30:45"));
	}

}
