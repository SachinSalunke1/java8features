package com.startech.collection.conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayToList {

	public static void main(String[] args) {
		Integer[] source = { 0, 1, 2, 3, 4, 5 };

		// Approach 1
		List<Integer> list = Arrays.asList(source);
		list.forEach(e -> System.out.println(e));

		// Approach 2
		List<Integer> al = new ArrayList<>(Arrays.asList(source));
		al.forEach(e -> System.out.println(e));

		// Approach 3
		List<Integer> stream = Arrays.stream(source).collect(Collectors.toList());
		stream.forEach(e -> System.out.println(e));

		// Approach 4
		List<Integer> col = new ArrayList<>();
		Collections.addAll(col, source);
		
	}

}
