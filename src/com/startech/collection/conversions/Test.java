package com.startech.collection.conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Map<Integer, String> mapSource = new HashMap<>();
		mapSource.put(101, "ABC");
		mapSource.put(102, "PQR");
		mapSource.put(103, "XYZ");

		Collection<String> values = mapSource.values();
		String[] array = values.toArray(new String[mapSource.size()]);
		System.out.println(Arrays.toString(array));
		System.out.println("--------------------------");
		
		List<String> list = new ArrayList<>(values);
		System.out.println(list);

		Set<String> set = new HashSet<>(values);
		System.out.println(set);
		
		String[] array2 = set.toArray(new String[set.size()]);
		System.out.println(Arrays.toString(array2));

	}

}
