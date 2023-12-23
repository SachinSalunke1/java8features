package com.startech.functional_interface;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		// Without Lambda Expression
		Sayable sayable = new Sayable() {

			@Override
			public void say(String msg) {
				System.out.println("Message :" + msg);
			}
		};
		sayable.say("This is Functional Interface.");
		
		// With Lambda Expression
		
		Sayable sayable2 = (msg)->System.out.println("Message With Lambda :"+msg);
		sayable2.say("This Functional Interface with Lambda Expression");
	}

}
