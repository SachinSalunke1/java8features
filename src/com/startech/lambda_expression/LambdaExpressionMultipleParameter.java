package com.startech.lambda_expression;

interface Addable {
	public int add(int a, int b);
}

public class LambdaExpressionMultipleParameter {

	public static void main(String[] args) {

		// Without Lambda Expression
		Addable addable = new Addable() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		System.out.println("Addition 1 :" + addable.add(5, 4));
		// With Lambda Expression

		Addable addable2 = (a, b) ->  a + b ;
		System.out.println("Addition 2 :" + addable2.add(6, 4));

	}

}
