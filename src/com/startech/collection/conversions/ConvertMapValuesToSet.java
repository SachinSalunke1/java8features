package com.startech.collection.conversions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConvertMapValuesToSet {
	
	public static Set<String> mapValuesToSet(Map<Integer, String> sourceMap){
		Set<String> target = new HashSet<>(sourceMap.values());
		return target;
	}
	
	public static void main(String[] args) {
		Map<Integer, String> mapSource = new HashMap<>();
		mapSource.put(101, "ABC");
		mapSource.put(102, "PQR");
		mapSource.put(103, "XYZ");
		
		mapSource.forEach((k,v)-> System.out.println(k+" | "+v));
		System.out.println("-----------------Map values converts into Set---------------------------");
		Set<String> mapToSet = mapValuesToSet(mapSource);
		mapToSet.stream().forEach(e -> System.out.println(e));
	}

}
