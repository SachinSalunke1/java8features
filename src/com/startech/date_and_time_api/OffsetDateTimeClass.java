package com.startech.date_and_time_api;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAdjusters;

public class OffsetDateTimeClass {

	public static void main(String[] args) {
		// Find the last Thursday in July 2013.
		LocalDateTime dateTime = LocalDateTime.of(2013, Month.JULY, 20, 19, 30);
		ZoneOffset offset = ZoneOffset.of("-08:00");

		OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, offset);
		OffsetDateTime lastThursday = offsetDateTime.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));
		System.out.printf("The last Thursday in July 2013 is the %sth.%n", lastThursday.getDayOfMonth());
	}

}
