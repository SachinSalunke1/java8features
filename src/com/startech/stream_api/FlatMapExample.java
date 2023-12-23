package com.startech.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);
		List<List<Integer>> mergeList = Arrays.asList(list1, list2, list3);
		System.out.println(mergeList);

		List<Integer> collect = mergeList.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(collect);
		
		

	}

}
