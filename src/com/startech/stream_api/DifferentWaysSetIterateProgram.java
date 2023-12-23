package com.startech.stream_api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferentWaysSetIterateProgram {
	
	public static void printCourse(String course) {
		System.out.print(course + ",");
	}

	public static void main(String[] args) {
		Set<String> courses = new HashSet<String>();
		courses.add("Java");
		courses.add("C");
		courses.add("C++");
		courses.add("Python");
		courses.add("Scala");

		// Basic loop
		//Since Set interface or HashSet class doesn't provide a get() method to retrieve elements, 
		//the only way to take out elements from a Set is to iterate over it by using the Iterator
		Iterator<String> itr = courses.iterator();
		for(int i=0;i<courses.size();i++) {
			printCourse(itr.next());
		}
		System.out.println("----------------Basic loop-------------------------------------");

		// Enhanced for Loop
		for(String course:courses) {
			printCourse(course);
		}
		System.out.println("----------------Enhanced for Loop------------------------------");

		// Basic loop with iterator
		for(Iterator<String> it = courses.iterator();it.hasNext();) {
			printCourse(it.next());
		}
		System.out.println("----------------Basic loop with iterator-----------------------");

		// Iterator with while loop
		Iterator<String> iterator = courses.iterator();
		while(iterator.hasNext()) {
			printCourse(iterator.next());
		}
		System.out.println("----------------Iterator with while loop-----------------------");

		// JDK 8 streaming example lambda expression
		courses.stream().forEach( e -> printCourse(e));
		System.out.println("----------------JDK 8 streaming example lambda expression------");

		// JDK 8 streaming example method reference
		courses.stream().forEach(DifferentWaysSetIterateProgram::printCourse);
		System.out.println("----------------JDK 8 streaming example method reference-------");

		// JDK 8 for each with lambda
		courses.forEach( course -> printCourse(course));
		System.out.println("----------------JDK 8 for each with lambda---------------------");
		
		// JDK 8 for each
        courses.forEach(DifferentWaysSetIterateProgram::printCourse);
        System.out.println("----------------JDK 8 for each --------------------------------");
	}

}
