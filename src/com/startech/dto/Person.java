package com.startech.dto;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

public class Person {

	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + ", gender=" + gender + ", emailAddress="
				+ emailAddress + "]";
	}

	public static List<Person> createRoster() {
		List<Person> roster = new ArrayList<Person>();
		roster.add(new Person("Fred", IsoChronology.INSTANCE.date(1980, 6, 20), Person.Sex.MALE, "fred@example.com"));
		roster.add(new Person("Jane", IsoChronology.INSTANCE.date(1990, 7, 15), Person.Sex.FEMALE, "jane@example.com"));
		roster.add(
				new Person("George", IsoChronology.INSTANCE.date(1991, 8, 13), Person.Sex.MALE, "george@example.com"));
		roster.add(new Person("Bob", IsoChronology.INSTANCE.date(2000, 9, 12), Person.Sex.MALE, "bob@example.com"));
		return roster;
	}

}
