package com.startech.collection.conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		List<Integer> sourceSet = new ArrayList();
		sourceSet.add(0);
		sourceSet.add(1);
		sourceSet.add(2);
		sourceSet.add(3);
		sourceSet.add(4);
		sourceSet.add(5);

		// Approach 1
		Integer[] target = sourceSet.toArray(new Integer[sourceSet.size()]);
		System.out.println(Arrays.toString(target));
		
		// Approach 2
		Integer[] array = sourceSet.stream().toArray(Integer[]::new);
	}

}
