package com.startech.method_reference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodReferenceToConstructor {

	public static void main(String[] args) {
		Messageable messageable = Message::new;
		messageable.getMessage("Hello This is constructor calling");
		System.out.println("-------------------------------------");
		// 4. reference to a constructor
		List<String> fruits = new ArrayList<>();
		// Adding new elements to the ArrayList
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("mango");
		fruits.add("orange");

		// Using lambda expression
		Function<List<String>, Set<String>> f2 = (e) -> new HashSet<String>(e);
		Set<String> set2 = f2.apply(fruits);
		System.out.println(set2);
		
		// Using Method reference
		Function<List<String>, Set<String>> f3 = HashSet::new;
		Set<String> set3 = f3.apply(fruits);
		System.out.println(set3);
	}

}

interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.println(msg);
	}
}
