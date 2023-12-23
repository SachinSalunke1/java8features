package com.startech.fi.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.startech.dto.User;

public class TestPredicateFI {

	public static void main(String[] args) {
		PredicateFI.predicate_or();

		System.out.println("-----------------------------------------------------");

		// Java program to illustrate AND Predicate
		Predicate<String> nonNullPredicate = Objects::nonNull;
		String nullString = null;
		boolean and1 = nonNullPredicate.and(PredicateFI.hasLengthOf10).test(nullString);
		System.out.println(and1);

		String lengthGtThan10 = "Welcome to the machine";
		boolean and2 = nonNullPredicate.and(PredicateFI.hasLengthOf10).test(lengthGtThan10);
		System.out.println(and2);
		System.out.println("-----------------------------------------------------");

		// Java program to illustrate
		// negate Predicate
		PredicateFI.predicate_negate();;
		System.out.println("-----------------------------------------------------");

		// Java program to demonstrate working of predicates
		// on collection. The program finds all admins in an
		// arrayList of users.

		List<User> users = new ArrayList<>();
		users.add(new User("John", "Admin"));
		users.add(new User("Peter", "member"));

		List<User> admin = PredicateFI.process(users, (User u) -> u.getRole().equals("Admin"));
		System.out.println(admin);
		System.out.println("-----------------------------------------------------");
		List<User> admins = users.stream().filter(u-> u.getRole().equals("Admin")).collect(Collectors.toList());
		System.out.println(admins);
		System.out.println("-----------------------------------------------------");
	}

}
