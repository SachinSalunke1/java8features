package com.startech.lambda_expression;

interface Sayable {
	public String say();
}

public class LambdaExpressionNoParameter {

	public static void main(String[] args) {

		// without lambda expression

		Sayable sayable = new Sayable() {

			@Override
			public String say() {
				return "Returing somethig...";
			}
		};
		System.out.println(sayable.say());

		// with lambda expression

		Sayable noArgs = () -> {
			return "say something";
		};
		System.out.println(noArgs.say());
		
		
	}

}
