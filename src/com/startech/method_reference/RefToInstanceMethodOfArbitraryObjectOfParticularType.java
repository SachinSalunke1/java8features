package com.startech.method_reference;

import java.util.Arrays;

public class RefToInstanceMethodOfArbitraryObjectOfParticularType {

	public static void main(String[] args) {
		String[] str = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
		Arrays.sort(str, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(str));
	}

}
