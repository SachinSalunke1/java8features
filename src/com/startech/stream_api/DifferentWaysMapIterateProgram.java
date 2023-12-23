package com.startech.stream_api;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DifferentWaysMapIterateProgram {

	private static void coursePrinter(Integer number, String brand) {
        System.out.println("course no : " + number + " and course name : " + brand);
    }

	public static void main(String[] args) {
		Map<Integer, String> courses = new HashMap<Integer, String>();
		courses.put(1, "C");
		courses.put(2, "C++");
		courses.put(3, "Java");
		courses.put(4, "J2EE");
		courses.put(5, "Python");
		courses.put(6, "Scala");

		
		// Enhanced for Loop
		for(Map.Entry<Integer, String> course : courses.entrySet()) {
			coursePrinter(course.getKey(),course.getValue());
		}
		System.out.println("----------------Enhanced for Loop------------------------------");
	
		// Iterator with while loop
		Iterator<Map.Entry<Integer, String>> iterator = courses.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> course = iterator.next();
			coursePrinter(course.getKey(),course.getValue());
		}
		System.out.println("----------------Iterator with while loop-----------------------");
		
		// JDK 8 streaming example lambda expression
		courses.forEach((k,v) -> coursePrinter(k,v));
		System.out.println("----------------JDK 8 streaming example lambda expression------");

		// JDK 8 for each method reference
		courses.forEach(DifferentWaysMapIterateProgram::coursePrinter);
		System.out.println("----------------JDK 8 for each---------------------------------");

		
	}

}
