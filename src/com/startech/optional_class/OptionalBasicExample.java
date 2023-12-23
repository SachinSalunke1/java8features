package com.startech.optional_class;

import java.util.Optional;

public class OptionalBasicExample {

	public static void main(String[] args) {

		//Example 1 :
		Optional<String> gender = Optional.of("MALE");
		String ans1 = "yes";
		String ans2 = null;
		
		System.out.println("Non-empty Optional :" + gender);
		System.out.println("Non-Empty Optional: Gender value : " + gender.get());
		System.out.println("Empty Optional :" + Optional.empty());
		System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(ans1));
		System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(ans2));
		System.out.println("--------------------------------------------------");
		//Example 2 :
		String[] words = new String[10];
		//Nullpointer Exception
		//String lowerCase = words[5].toLowerCase();
		//System.out.println(lowerCase);
		
		//Avoid Null pointer Exception
		Optional<String> checkNull = Optional.ofNullable(words[5]);
		String word = checkNull.isPresent() ? words[5].toLowerCase(): "word is empty";
		System.out.println(word);
		System.out.println("--------------------------------------------------");
		
		
	}

}
