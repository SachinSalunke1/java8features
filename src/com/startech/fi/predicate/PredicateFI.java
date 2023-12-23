package com.startech.fi.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.startech.dto.User;

public class PredicateFI {

	public static void pred(Integer number, Predicate<Integer> predicate) {
		if (predicate.test(number)) {
			System.out.println("Number :" + number);
		}
	}

	public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
		@Override
		public boolean test(String t) {
			return t.length() > 10;
		}
	};

	public static void predicate_or() {
		Predicate<String> containLetterA = s -> s.contains("A");
		String containsA = "And";
		boolean test = hasLengthOf10.or(containLetterA).test(containsA);
		System.out.println(" Java program to illustrate OR Predicate :" + test);
	}

	public static void predicate_negate() {
		String lengthGtThan10 = "Thunderstruck is a 2012 children's film starring Kevin Durant";
		boolean negate1 = hasLengthOf10.negate().test(lengthGtThan10);
		System.out.println(negate1);
	}

	public static List<User> process(List<User> users, Predicate<User> predicate) {
		List<User> result = new ArrayList<>();
		for (User user : users) {
			if (predicate.test(user)) {
				result.add(user);
			}
		}
		return result;
	}
}
