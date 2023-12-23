package com.startech.date_and_time_api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatExample {

	private static final DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d/MM/yyyy");
	private static final DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d-MMM-yyyy");
	private static final DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("d MMMM yyyy");

	public static void main(String[] args) {
		 //default format
		 System.out.println("Default format of LocalDate = " + LocalDate.now());
		 
		 // The ISO date formatter that formats or parses a date without an
		 // offset, such as '20111203'
		 LocalDate localDate = LocalDate.now();
		 System.out.println(localDate.format(DateTimeFormatter.BASIC_ISO_DATE));
		 
		 System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));
		 
		 System.out.println(formatter1.format(LocalDate.parse("16/08/2023",formatter1)));
		 System.out.println(formatter2.format(LocalDate.parse("16-Aug-2023",formatter2)));
		 System.out.println(formatter3.format(LocalDate.parse("16 August 2023",formatter3)));
	}

}
