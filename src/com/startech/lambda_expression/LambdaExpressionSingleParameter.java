package com.startech.lambda_expression;

interface Printable {
	public void print(String msg);
}

public class LambdaExpressionSingleParameter {

	public static void main(String[] args) {

		// Without lambda Expression
		Printable printable = new Printable() {

			@Override
			public void print(String msg) {
				System.out.println("message :\n" + msg);
			}
		};
		printable.print("1 :Printing on console...");

		// With Lambda Expression
		Printable printable2 = (msg) -> {
			System.out.println(msg);
		};
		printable2.print("2 :Printing on Console...");

	}

}
