package com.startech.fi.predicate;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		// Java program to illustrate Simple Predicate
		Predicate<Integer> simplePredicate = (i) -> i < 25;
		boolean test1 = simplePredicate.test(30);
		boolean test2 = simplePredicate.test(25);
		boolean test3 = simplePredicate.test(20);
		System.out.println("Test1 :" + test1 + " | Test2 :" + test2 + " | Test3 :" + test3);
		
		System.out.println("-----------------------------------------------------");
		
		// Java program to illustrate Predicate Chaining
		Predicate<Integer> lowerThan = (i) -> i < 20;
		Predicate<Integer> greaterThan = (i) -> i > 10;
		boolean chain1 = greaterThan.and(lowerThan).test(15);
		boolean chain2 = greaterThan.and(lowerThan).test(10);
		boolean chain3 = greaterThan.and(lowerThan).test(25);
		System.out.println("Chain1 :" + chain1 + " | Chain2 :" + chain2 + " | Chain3 :" + chain3);
		
		System.out.println("-----------------------------------------------------");


		// Calling Predicate method
		boolean call1 = greaterThan.and(lowerThan).negate().test(15);
		boolean call2 = greaterThan.and(lowerThan).negate().test(10);
		boolean call3 = greaterThan.and(lowerThan).negate().test(25);
		System.out.println("Call1 :" + call1 + " | Call2 :" + call2 + " | Call3 :" + call3);

		System.out.println("-----------------------------------------------------");
		
		// passing Predicate into function
		Predicate<Integer> predicate = i -> i > 7;
		PredicateFI.pred(10, predicate);

		// Java program to illustrate OR Predicate
		boolean or1 = greaterThan.or(lowerThan).test(15);
		boolean or2 = greaterThan.or(lowerThan).test(10);
		boolean or3 = greaterThan.or(lowerThan).test(25);
		System.out.println("or1 :" + or1 + " | or2 :" + or2 + " | or3 :" + or3);
		System.out.println("-----------------------------------------------------");
	}

}
