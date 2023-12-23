package com.startech.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFormArray {

	public static List<String> removeDuplicates1(List<String> list) {
		Set<String> set = new LinkedHashSet<>(list);
		return new ArrayList<>(set);
	}

	public static List<String> removeDuplicates2(List<String> list) {
		return list.stream().distinct().collect(Collectors.toList());
	}

	public static List<String> removeDuplicates3(List<String> list) {
		List<String> result = new ArrayList<>();
		for (String item : list) {
			if (!result.contains(item)) {
				result.add(item);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sam", "Pyal", "null", null, "Druv", "sam", "jorden", null);
		System.out.println(list);
		System.out.println("---------------------------------------");
		List<String> set = removeDuplicates1(list);
		System.out.println(set);
		System.out.println("---------------------------------------");
		List<String> list2 = removeDuplicates2(list);
		System.out.println(list2);
		System.out.println("---------------------------------------");
		List<String> list3 = removeDuplicates3(list);
		System.out.println(list3);
	}

}
