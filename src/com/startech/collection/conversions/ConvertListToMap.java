package com.startech.collection.conversions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertListToMap {

	public static void main(String[] args) {
		List<Integer> sourceSet = new ArrayList();
		sourceSet.add(0);
		sourceSet.add(1);
		sourceSet.add(2);
		sourceSet.add(3);
		sourceSet.add(4);
		sourceSet.add(5);
		
		Map<Integer, Integer> map = new HashMap<>();
		int i=0;
		for(Integer value:sourceSet) {
			map.put(i++, value);
		}
		System.out.println(map);
	}

}
