package com.startech.interview_program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortValues {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		list.stream().sorted().forEach(System.out::println); // Ascending
		System.out.println();
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println); //descending
	}

}
