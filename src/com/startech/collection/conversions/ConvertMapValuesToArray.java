package com.startech.collection.conversions;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ConvertMapValuesToArray {

	public static String[] convertMapValuesToArray(Map<Integer, String> mapSource) {
		Collection<String> mapValues = mapSource.values();
		String[] array = mapValues.toArray(new String[mapValues.size()]);
		return array;
	}

	public static void main(String[] args) {

		Map<Integer, String> mapSource = new HashMap<>();
		mapSource.put(101, "ABC");
		mapSource.put(102, "PQR");
		mapSource.put(103, "XYZ");

		mapSource.forEach((k, v) -> System.out.println(k + " | " + v));
		System.out.println("----------------Map values converts into Array-------------------------------");
		String[] str = convertMapValuesToArray(mapSource);
		System.out.println(Arrays.toString(str));
	}

}
