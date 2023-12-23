package com.startech.stream_api;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

	public static void usingReduce(List<Integer> numbers) {
		Integer sumReduce = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Sum using Reduce :" + sumReduce);
	}

	public static void withoutReduce(List<Integer> numbers) {
		Integer sum = 0;
		for (Integer num : numbers) {
			sum += num;
		}
		System.out.println("Sum Without Reduce :" + sum);
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		usingReduce(numbers);
		withoutReduce(numbers);
	}

}
