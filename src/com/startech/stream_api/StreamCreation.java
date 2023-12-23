package com.startech.stream_api;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamCreation {

	// It's often the case that the empty() method is used upon creation to avoid
	// returning null for streams with no element:
	public Stream<String> streamOf(List<String> list) {
		return list == null || list.isEmpty() ? Stream.empty() : list.stream();
	}

	public static void main(String[] args) {
		// 1. The empty() method should be used in case of the creation of an empty stream:
		Stream<String> emptyStream = Stream.empty();
		emptyStream.forEach(System.out::println);
		System.out.println("-----------------------------------------------------");

		// 2. Creating Stream from From Collections
		Collection<String> collection = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
		Stream<String> collectionStream = collection.stream();
		collectionStream.forEach(System.out::println);
		System.out.println("-----------------------------------------------------");

		List<String> list = Arrays.asList("JIRA", "Docker", "Jenkins", "GitHub");
		Stream<String> listStream = list.stream();
		listStream.forEach(System.out::println);
		System.out.println("-----------------------------------------------------");
		
		Set<String> set = new HashSet<>(list);
		Stream<String> setStream = set.stream();
		setStream.forEach(System.out::println);
		System.out.println("-----------------------------------------------------");
		
		// 3. Creating Stream object from Arrays
		 // Array can also be a source of a Stream
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		streamOfArray.forEach(System.out::println);
		System.out.println("-----------------------------------------------------");
		
		// creating from existing array or of a part of an array:
		String[] str = new String[] {"P","Q","R"};
		Stream<String> streamOfArrayFull = Arrays.stream(str);
		streamOfArrayFull.forEach(System.out::println);
		System.out.println("-----------------------------------------------------");
		
		Stream<String> streamOfArrayPart = Arrays.stream(str, 1, 3);
		streamOfArrayPart.forEach(System.out::println);
		System.out.println("-----------------------------------------------------");
	}

}
