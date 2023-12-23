package com.startech.stream_api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysListIterateProgram {

	public static void printCourse(String course) {
		System.out.print(course + ",");
	}

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("C", "C++", "Core Java", "J2EE", "Spring", "Hibernate", "Python");

		// Basic loop
		for (int i = 0; i < courses.size(); i++) {
			String course = courses.get(i);
			printCourse(course);
		}
		System.out.println("----------------Basic loop-------------------------------------");

		// Enhanced for Loop
		for (String str : courses) {
			printCourse(str);
		}
		System.out.println("----------------Enhanced for Loop------------------------------");

		// Basic loop with iterator
		for (Iterator<String> it = courses.iterator(); it.hasNext();) {
			printCourse(it.next());
		}
		System.out.println("----------------Basic loop with iterator-----------------------");

		// Iterator with while loop
		Iterator<String> it = courses.iterator();
		while (it.hasNext()) {
			printCourse(it.next());
		}
		System.out.println("----------------Iterator with while loop-----------------------");

		// JDK 8 streaming example lambda expression
		courses.stream().forEach(DifferentWaysListIterateProgram::printCourse);
		System.out.println("----------------JDK 8 streaming example lambda expression------");

		// JDK 8 for each
		courses.forEach(DifferentWaysListIterateProgram::printCourse);
		System.out.println("----------------JDK 8 for each---------------------------------");

		// JDK 8 for each with lambda
		courses.forEach( c -> System.out.print(c+","));
		System.out.println("----------------JDK 8 for each with lambda---------------------");
	}

}
