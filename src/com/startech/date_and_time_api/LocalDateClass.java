package com.startech.date_and_time_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateClass {

	// Get local date by passing year,month and dayOfMonth to this method.
	static LocalDate getLocalDateUsingFactoryOfMethod(int year, int month, int dayOfMonth) {
		return LocalDate.of(year, month, dayOfMonth);
	}

	// Get current date or today's using this method.
	static LocalDate getLocaldateFromClock() {
		return LocalDate.now();
	}

	// Get next day of today's or specific date using this method.
	static LocalDate getNextDay(LocalDate localDate) {
		return localDate.plusDays(1);
	}

	// Get previous day by passing specific date to this method.
	static LocalDate getPreviousDay(LocalDate localDate) {
		return localDate.minusDays(1);
	}

	// Get previous day by passing specific date to this method.
	static LocalDate getPreviousDay1(LocalDate localDate) {
		return localDate.minus(1, ChronoUnit.DAYS);
	}

	// Get day of week using this method.
	static DayOfWeek getDayOfWeek(LocalDate localDate) {
		return localDate.getDayOfWeek();
	}

	// Get first day of the month.
	static LocalDate getFirstDayOfMonth() {
		return LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
	}

	// Get start of the day.
	static LocalDateTime getStartOfDay(LocalDate localDate) {
		return localDate.atStartOfDay();
	}

	// check for recurring events e.g. birthday in Java 8.
	static String recurringDate(LocalDate today) {
		LocalDate birthDate = LocalDate.of(1984, 2, 1);
		MonthDay birthDay = MonthDay.of(birthDate.getMonth(), birthDate.getDayOfMonth());
		MonthDay currentMonthDay = MonthDay.from(today);
		return (currentMonthDay.equals(birthDay)) ? "Many Many happy returns of the day !!"
				: "Sorry, today is not your birthday";

	}

	public static void main(String[] args) {
		System.out.println(getLocalDateUsingFactoryOfMethod(1984, 2, 1));
		System.out.println("--------------------------------------");
		System.out.println(getLocaldateFromClock());
		System.out.println("--------------------------------------");
		System.out.println(getNextDay(LocalDate.now()));
		System.out.println("--------------------------------------");
		System.out.println(getPreviousDay(LocalDate.now()));
		System.out.println("--------------------------------------");
		System.out.println(getPreviousDay1(LocalDate.now()));
		System.out.println("--------------------------------------");
		System.out.println(getDayOfWeek(LocalDate.now()));
		System.out.println("--------------------------------------");
		System.out.println(getFirstDayOfMonth());
		System.out.println("--------------------------------------");
		System.out.println(getDayOfWeek(LocalDate.now()));
		System.out.println("--------------------------------------");
		LocalDate myDate = LocalDate.of(1984, 2, 1);
		System.out.println(recurringDate(myDate));
		System.out.println("--------------------------------------");
	}

}
