package com.startech.date_and_time_api;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeClass {

	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");
		// Leaving from San Francisco on July 20, 2013, at 7:30 p.m.
		LocalDateTime leaving = LocalDateTime.of(2013, Month.JULY, 20, 19, 30);

		ZoneId leavingZone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);
		String out1 = departure.format(format);
		System.out.printf("LEAVING : %s (%S)%n", out1, leavingZone);

		ZoneId arrivingZone = ZoneId.of("Asia/Tokyo");
		ZonedDateTime arrival = departure.withZoneSameInstant(arrivingZone).plusMinutes(650);
		String out2 = arrival.format(format);
		System.out.printf("ARRIVING: %s (%s)%n", out2, arrivingZone);

	}

}
