package com.startech.annotations.interviewprograms;

import java.util.Arrays;
import java.util.List;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10, 15, 20, 54, 62, 36, 51, 13, 17);
		nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

}
