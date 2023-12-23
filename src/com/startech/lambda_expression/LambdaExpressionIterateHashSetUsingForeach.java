package com.startech.lambda_expression;

import java.util.HashSet;
import java.util.Set;

public class LambdaExpressionIterateHashSetUsingForeach {

	public static void main(String[] args) {
		Set<String> courses = new HashSet<String>();
        courses.add("Java");
        courses.add("C");
        courses.add("C++");
        courses.add("Python");
        courses.add("Scala");
        
     // JDK 8 streaming example lambda expression
        courses.stream().forEach((course)-> coursePrinter(course));
        System.out.println("-------------------------------------");
        
     // JDK 8 streaming example method reference
        courses.stream().forEach(LambdaExpressionIterateHashSetUsingForeach::coursePrinter);
        System.out.println("-------------------------------------");
        
     // JDK 8 for each with lambda
        courses.forEach((course) -> coursePrinter(course));
        System.out.println("-------------------------------------");
        
     // JDK 8 for each
        courses.forEach(LambdaExpressionIterateHashSetUsingForeach:: coursePrinter);
        
	}
	// common method to print course
    private static void coursePrinter(String course) {
        System.out.println("course name :: " + course);
    }

}
