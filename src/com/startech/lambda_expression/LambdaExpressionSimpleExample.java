package com.startech.lambda_expression;

interface Drawable {
	public void draw();
}

public class LambdaExpressionSimpleExample {
	public static void main(String[] args) {
		int width = 10;
		
		Drawable drawable = () -> {
			System.out.println(" Drawing..."+width);
		};
		drawable.draw();

	}

}
