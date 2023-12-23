package com.startech.other_features;

import java.util.StringJoiner;

public class StringJoinerClass {

	public static void main(String[] args) {
		// 1: Simple Delimiters
		StringJoiner joinNamesWithComma = new StringJoiner(",");
		joinNamesWithComma.add("Jony");
		joinNamesWithComma.add("John");
		joinNamesWithComma.add("Tony");
		joinNamesWithComma.add("Amir");
		joinNamesWithComma.add("Prabhas");

		System.out.println(joinNamesWithComma);
		System.out.println("-----------------------------------------");

		StringJoiner joinNamesWithPipe = new StringJoiner(" | ", "{", "}");
		joinNamesWithPipe.add("Sam");
		joinNamesWithPipe.add("Nancy");
		joinNamesWithPipe.add("Tikku");
		joinNamesWithPipe.add("Iris");
		joinNamesWithPipe.add("Gibbs");
		System.out.println(joinNamesWithPipe);
		System.out.println("-----------------------------------------");

		// 2: adding prefix and suffix

		StringJoiner joinNames = new StringJoiner(",", "[", "]");
		joinNames.add("Ash");
		joinNames.add("Jashmin");
		joinNames.add("Tinu");
		joinNames.add("Anand");
		joinNames.add("Pari");
		System.out.println(joinNames);
		System.out.println("-----------------------------------------");

		// 3: Merge Two StringJoiner
		StringJoiner merge = joinNamesWithPipe.merge(joinNames);
		System.out.println(merge);
		System.out.println("-----------------------------------------");

		// 4: StringJoiner Methods
		StringJoiner sj = new StringJoiner(",","[","]");
		// Prints nothing because it is empty
		System.out.println("No data added in String Joiner :" + sj);
		System.out.println("------------------------------------------");

		// We can set default empty value.
		sj.setEmptyValue("This is empty String joiner");
		System.out.println(sj);
		System.out.println("------------------------------------------");

		// Adding values to StringJoiner
		sj.add("Ashish");
		sj.add("Vinay");
		System.out.println("Added below data to String joiner");
		System.out.println(sj);
		System.out.println("------------------------------------------");

		// Returns length of StringJoiner
		System.out.println("Length of String joiner :" + sj.length());
		System.out.println("------------------------------------------");

		// Returns StringJoiner as String type
		String str = sj.toString();
		System.out.println("String joiner as String :" + str);
		System.out.println("------------------------------------------");

		// Now, we can apply String methods on it
		char ch = str.charAt(5);
		System.out.println("Character at index 5: " + ch);
		System.out.println("------------------------------------------");
		
		// Adding one more element   
		sj.add("Vaibhav");
		System.out.println("New value added to string joiner :"+sj);
		System.out.println("------------------------------------------");
		
		// Returns length  
		int newLength = sj.length();
		System.out.println("New Length of String Joiner :"+newLength);
		System.out.println("------------------------------------------");
	}

}
