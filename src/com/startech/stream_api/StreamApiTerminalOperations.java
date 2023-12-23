package com.startech.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiTerminalOperations {
	/*
	 * anyMatch() allMatch() noneMatch() collect() count() findAny() findFirst()
	 * forEach() min() max() reduce() toArray()
	 */

	public static void main(String[] args) {
		// 1 . anyMatch() : takes a single Predicate as a parameter
		List<String> stringList = new ArrayList<String>();
		stringList.add("Java Guides");
		stringList.add("Python Guides");
		stringList.add("C Guides");

		boolean anyMatch =stringList.stream().anyMatch(v -> {
			return v.startsWith("Java");
		});
		System.out.println("Anymacth Result :"+anyMatch);
		System.out.println("---------------------------------");

		// 2 . allMatch():takes a single Predicate as the parameter
		//If the Predicate returns true for all elements in the Stream, the allMatch() will return true.
		boolean allMatch = stringList.stream().allMatch(v -> v.contains("Guides"));
		System.out.println("Allmatch Result :"+allMatch);
		System.out.println("---------------------------------");
		
		// 3 . noneMatch()
		boolean nonematch = stringList.stream().noneMatch(v-> v.contains("Jiva"));
		System.out.println("Nonematch Result :"+nonematch);
		System.out.println("---------------------------------");
		
		// 4 . collect()
		List<String> collect=stringList.stream().map(v-> v.toUpperCase()).collect(Collectors.toList());
		System.out.println("Collect :"+collect);
		System.out.println("---------------------------------");
		
		// 5 . count()
		long count = stringList.stream().count();
		System.out.println("Count :"+count);
		System.out.println("---------------------------------");
		
		// 6 . findAny()
		Optional<String> findany=stringList.stream().findAny();
		System.out.println("Find Any :"+findany.get());
		System.out.println("---------------------------------");
		
		// 7 . findFirst()
		
		Optional<String> findFirst = stringList.stream().findFirst();
		System.out.println("Find first :"+findFirst.get());
		System.out.println("---------------------------------");
		
		// 8 . forEach()
		stringList.stream().forEach(e -> System.out.println(e));
		System.out.println("---------------------------------");
		
		// 9 . min()
		Optional<String> min = stringList.stream().min((v1,v2)-> {return v1.compareTo(v2);});
		System.out.println("Min :"+min.get());
		System.out.println("---------------------------------");
		
		// 10 . max()
		Optional<String> max = stringList.stream().max((v1,v2)-> {return v1.compareTo(v2);});
		System.out.println("max :"+max.get());
		System.out.println("---------------------------------");
		
		// 11 . reduce():  can reduce all elements in the stream to a single element. 
		Optional<String> reduce = stringList.stream().reduce((value,combinedValue)->{return combinedValue+" + "+value;});
		System.out.println("Reduce :"+reduce.get());
		System.out.println("---------------------------------");
		// 12 . toArray()
		Object[] array = stringList.stream().toArray();
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println("---------------------------------");
		

	}

}
