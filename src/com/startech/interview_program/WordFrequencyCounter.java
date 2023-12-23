package com.startech.interview_program;

import java.util.Arrays;
import java.util.HashMap;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		String text = "This is a sample text. This text contains sample words.";
		String[] words = text.split("\\s+");
		System.out.println(Arrays.toString(words));
		HashMap<String, Integer> freq = new HashMap<>();
		for (String word : words) {
			freq.put(word, freq.getOrDefault(word, 0) + 1);
		}
		System.out.println("Word frequencies: " + freq);
	}
}
