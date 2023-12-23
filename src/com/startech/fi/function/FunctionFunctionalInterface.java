package com.startech.fi.function;

import java.util.function.Function;

public class FunctionFunctionalInterface {

	public static void main(String[] args) {
		int num = 5;

		Function<Integer, Double> function1_half = n -> (double) n / 2;
		Function<Double, Double> function2_twice = res -> (double) res * 2;

		// Java Program to Illustrate Functional Interface Via apply() method

		Double apply_result1 = function1_half.apply(num);
		Double apply_result2 = function2_twice.apply(apply_result1);

		System.out.println("apply_result1 :" + apply_result1 + " | apply_result2 :" + apply_result2);
		System.out.println("-------------------------------------------------");

		// Java Program to illustrate addThen() method
		Function<Integer, Double> andThen = function1_half.andThen(function2_twice);
		System.out.println("addThen_result :" + andThen.apply(num));
		System.out.println("-------------------------------------------------");

		// Java Program to illustrate addThen() method
		// When NullPointerException occurs
		try {
			// Trying to pass null as parameter
			function1_half = function1_half.andThen(null);
		} catch (Exception e) {
			System.out.println("Exception thrown while passing null: " + e);
		}

		// Java Program to illustrate compose() method
		Function<Integer, Double> compose = function2_twice.compose(function1_half);
		System.out.println("Compose_Result :" + compose.apply(num));
		System.out.println("-------------------------------------------------");

		// Java Program to Illustrate identity() method
		Function<Integer, Integer> function_Identity = Function.identity();
		System.out.println("Function Identity :" + function_Identity.apply(10));
	}

}
