package com.startech.interview_program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<>();
		if (set.size() == list.size()) {
			System.out.println("No Duplicates");
		} else {
			System.out.println("Duplicate Found");
		}
	}

}
