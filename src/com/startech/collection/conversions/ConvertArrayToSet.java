package com.startech.collection.conversions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertArrayToSet {

	public static void main(String[] args) {
		Integer[] sourceArray = { 0, 1, 2, 3, 4, 5 };

		// Approach 1
		Set<Integer> targetSet = new HashSet<>(Arrays.asList(sourceArray));
		targetSet.forEach(e -> System.out.println(e));

		// Approach 2
		Set<Integer> set = Arrays.stream(sourceArray).collect(Collectors.toSet());
		set.forEach(e -> System.out.println(e));
	}

}
