package com.startech.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiIntermediateOperation {
	/*
	 * Intermediate Operations filter() map() flatMap() distinct() sorted() peek()
	 * limit() skip()
	 */

	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "c", "python");
		// 1 . filter() : can be used to filter out elements from a Java Stream.
		List<String> filteredList = list.stream().filter(l -> !"c".equals(l)).collect(Collectors.toList());
		System.out.println("Filtered List" + filteredList);
		System.out.println("--------------------------------------------------------");

		// 2 . map():converts (maps) an element to another object
		// convert each string to lowercase, uppercase, or to a substring of the
		// original string, or something completely else.
		List<String> intList = Arrays.asList("1", "2", "3", "4", "5");
		List<Integer> mapList = intList.stream().map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("Map List :" + mapList);
		System.out.println("--------------------------------------------------------");

		// 3 . flatMap() :is the combination of a map and a flat operation. This means
		// you
		// first apply the map function and then flatten the result.
		List<Integer> evens = Arrays.asList(2, 4, 6);
		List<Integer> odds = Arrays.asList(3, 5, 7);
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
		List<Integer> flatMapList = Stream.of(evens, odds, primes).flatMap(l -> l.stream())
				.collect(Collectors.toList());
		System.out.println("Flat Map List :" + flatMapList);
		System.out.println("--------------------------------------------------------");

		// 4 . distinct() :contain the distinct elements from the original stream. Any
		// duplicates will be eliminated.
		List<Integer> disctinctList = flatMapList.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Disctinct List :" + disctinctList);
		System.out.println("--------------------------------------------------------");

		// 5 . limit() :can limit the number of elements in a stream to a number given
		// to the limit() method as a parameter.
		System.out.println("--------------------------------------------------------");

		List<Integer> limitList = disctinctList.stream().limit(5).collect(Collectors.toList());
		System.out.println("Limited List :" + limitList);

		// 6 . peek():The peek() method returns a new Stream that contains all the
		// elements in the original stream.
		List<String> strList = Arrays.asList("one", "two", "three", "four");
		strList.stream().filter(e -> e.length() > 3).peek(p -> System.out.println("Filtered Value " + p))
				.map(String::toUpperCase).peek(e -> System.out.println("Mapped Value :" + e))
				.collect(Collectors.toList());
		System.out.println("--------------------------------------------------------");
	}

}
