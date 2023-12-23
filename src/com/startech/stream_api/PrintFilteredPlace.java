package com.startech.stream_api;

import java.util.ArrayList;
import java.util.List;

public class PrintFilteredPlace {

	public static void main(String[] args) {
		List<String> places = new ArrayList<>();
		places.add("Banglore");
		places.add("Mumbai");
		places.add("Kolkata");
		places.add("Chennai");
		places.add("Orrisa");
		
		places.stream().filter(p->p.equals("Banglore")).forEach(System.out::println);
	}

}
