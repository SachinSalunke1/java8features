package com.startech.lambda_expression;

import java.util.HashMap;
import java.util.Map;

public class LambdaExpressionIterateHashMapUsingForeach {

	public static void main(String[] args) {
		Map<Integer, String> coursesMap = new HashMap<Integer, String>();
		coursesMap.put(1, "C");
		coursesMap.put(2, "C++");
		coursesMap.put(3, "Java");
		coursesMap.put(4, "J2EE");
		coursesMap.put(5, "Python");
		coursesMap.put(6, "Scala");

		coursesMap.forEach((k, v) -> coursePrinter(k, v));
		System.out.println("----------------------------------------------------");

		coursesMap.forEach(LambdaExpressionIterateHashMapUsingForeach::coursePrinter);
		System.out.println("----------------------------------------------------");
	}

	// common method to print map key value
	private static void coursePrinter(Integer number, String brand) {
		System.out.println("course no : " + number + " and course name : " + brand);
	}

}
