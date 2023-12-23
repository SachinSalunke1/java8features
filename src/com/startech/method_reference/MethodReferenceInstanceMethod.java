package com.startech.method_reference;

import java.util.function.BiFunction;

import com.startech.functional_interface.Sayable;

public class MethodReferenceInstanceMethod {

	public void saySomething() {
		System.out.println("Hello, this is non-static method");
	}

	public void display(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		MethodReferenceInstanceMethod instanceMethod = new MethodReferenceInstanceMethod();
		SaySomething sayable = instanceMethod::saySomething;
		sayable.say();

		SaySomething sayable2 = new MethodReferenceInstanceMethod()::saySomething;
		sayable2.say();

		Printable printableLambda = (s) -> instanceMethod.display(s);
		printableLambda.print("This is Second example..");

		Printable printableRef = instanceMethod::display;
		printableRef.print("Hello");

		BiFunction<Integer, Integer, Integer> adder = Arithmetics::add;
		int result = adder.apply(10, 20);
		System.out.println("Sum of numbers is :" + result);
	}

}

interface SaySomething {
	void say();
}

@FunctionalInterface
interface Printable {
	void print(String msg);
}