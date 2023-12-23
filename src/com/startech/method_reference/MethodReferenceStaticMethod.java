package com.startech.method_reference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceStaticMethod {

	public static int addtion(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		Function<Integer, Double> sqrt = (input) -> Math.sqrt(input);
		System.out.println("Square Root :"+sqrt.apply(4));
		System.out.println("---------------------------------------");
		
		Function<Integer, Double> sqrtRefr = Math::sqrt;
		System.out.println("Square Root Ref :"+sqrtRefr.apply(4));
		System.out.println("---------------------------------------");
		
		BiFunction<Integer, Integer, Integer> add = (a,b)-> MethodReferenceStaticMethod.addtion(a, b);
		System.out.println("Addition :"+add.apply(5, 5));
		System.out.println("---------------------------------------");
		
		BiFunction<Integer, Integer, Integer> addref =MethodReferenceStaticMethod::addtion;
		System.out.println("Addition Ref :"+addref.apply(5, 5));
		System.out.println("---------------------------------------");
		
		BiFunction<Integer, Integer, Integer> add_1 = Arithmetics::add;
		System.out.println(" add 1 :"+add_1.apply(5, 5));
		System.out.println("---------------------------------------");
		
		BiFunction<Integer, Float, Float> add_2 = Arithmetics::add;
		System.out.println(" add 2 :"+add_2.apply(5, 5.14f));
		System.out.println("---------------------------------------");
		
		BiFunction<Float, Float, Float> add_3 = Arithmetics::add;
		System.out.println(" add 3 :"+add_3.apply(5.0f, 5.15f));
		System.out.println("---------------------------------------");
 	}

}
