package com.startech.collection.conversions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.startech.dto.PersonDto;

public class ConvertArrayToMap {

	public static void main(String[] args) {
		// Approach 1
		String[] array = { "key1", "value1", "key2", "value2" };
		Map<String, String> map1 = new HashMap<>();
		for (int i = 0; i < array.length; i += 2) {
			map1.put(array[i], array[i + 1]);
		}
		System.out.println(map1);

		// Approach 2
		PersonDto[] person = { new PersonDto("Sachin", 30), new PersonDto("Trisha", 8) };
		Map<String, Integer> map2 = Arrays.stream(person)
				.collect(Collectors.toMap(PersonDto::getName, PersonDto::getAge));
		System.out.println(map2);
	}

}
