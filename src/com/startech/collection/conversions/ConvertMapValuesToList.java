package com.startech.collection.conversions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapValuesToList {
	
	public static List<String> convertMapValuesToList(Map<Integer, String> sourceMap){
		List<String> target = new ArrayList<>(sourceMap.values());
		return target;
	}

	public static void main(String[] args) {
		Map<Integer, String> mapSource = new HashMap<>();
		mapSource.put(101, "ABC");
		mapSource.put(102, "PQR");
		mapSource.put(103, "XYZ");
		
		mapSource.forEach((k,v)-> System.out.println(k+" | "+v));
		
		System.out.println("----------------Map values converts into List-------------------------------");
		
		List<String> mapToList = convertMapValuesToList(mapSource);
		mapToList.forEach( e -> System.out.println(e));
	}

}
