package com.startech.stream_api.collectors;

import java.lang.reflect.Method;
import java.util.stream.Collectors;

public class CollectorsMethods {

	public static void main(String[] args) {
		Method[] declaredMethods = Collectors.class.getDeclaredMethods();
		int count = 0;
		for (Method method : declaredMethods) {
			if (!method.getName().startsWith("lambda")) {
				System.out.println(method.getName());
				count++;
			}

		}
		System.out.println("There are totally "+count+" methods found in Collectors class");
	}

}
