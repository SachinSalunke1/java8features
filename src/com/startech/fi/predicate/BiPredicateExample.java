package com.startech.fi.predicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	//This interface represents a predicate that takes two arguments.
	
	public static void main(String[] args) {
		BiPredicate<String, String> biPredicate = (s1,s2)->{
			return s1.equals(s2);
		};
		boolean test = biPredicate.test("string", "String");
		System.out.println(test);
	}

}
