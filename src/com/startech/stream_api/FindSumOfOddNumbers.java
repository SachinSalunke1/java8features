package com.startech.stream_api;

import java.util.Arrays;
import java.util.List;

public class FindSumOfOddNumbers {
	public static int findSumOfOddNumbers1(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				sum = sum + nums[i];
			}
		}
		return sum;
	}

	public static int findSumOfOddNumbers2(List<Integer> nums) {
		return nums.stream().filter(n -> n % 2 != 0).mapToInt(n -> n.intValue()).sum();
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum1 = findSumOfOddNumbers1(nums1);
		System.out.println(sum1);
		System.out.println("----------------------------------------");
		List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int sum2 = findSumOfOddNumbers2(nums2);
		System.out.println(sum2);
		System.out.println("----------------------------------------");
	}

}
