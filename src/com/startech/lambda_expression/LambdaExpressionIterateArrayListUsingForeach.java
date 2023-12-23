package com.startech.lambda_expression;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionIterateArrayListUsingForeach {

	public static void main(String[] args) {
		LambdaExpressionIterateArrayListUsingForeach obj = new LambdaExpressionIterateArrayListUsingForeach();

		List<String> courses = Arrays.asList("C", "C++", "Core Java", "J2EE", "Spring", "Hibernate", "Python");

		// JDK 8 streaming example lambda expression
		courses.stream().forEach(course -> printCourse(course));
		
		System.out.println("-----------------------------------------------------");

		// JDK 8 streaming example method reference
		courses.stream().forEach(LambdaExpressionIterateArrayListUsingForeach::printCourse);
		
		System.out.println("-----------------------------------------------------");
		
		// JDK 8 for each with lambda
		courses.forEach(course -> printCourse(course));
		
		System.out.println("-----------------------------------------------------");
		
		// JDK 8 for each
		courses.forEach(LambdaExpressionIterateArrayListUsingForeach::printCourse);
		
		System.out.println("-----------------------------------------------------");
	}

	public static void printCourse(String course) {
		System.out.println(" Course Name :" + course);
	}

}
