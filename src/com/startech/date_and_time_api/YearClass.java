
package com.startech.date_and_time_api;

import java.time.Year;

public class YearClass {

	public static void main(String[] args) {
		boolean validLeapYear = Year.of(2024).isLeap();
		System.out.println(validLeapYear);

	}

}
