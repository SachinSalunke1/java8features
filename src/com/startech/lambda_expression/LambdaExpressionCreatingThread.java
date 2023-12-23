package com.startech.lambda_expression;

public class LambdaExpressionCreatingThread {

	public static void main(String[] args) {
		//without lambda, Runnable implementation using anonymous class  
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable example without lambda exp.");
			}
		};
		Thread t1 = new Thread(runnable);
		t1.start();
		
		// With Lambda.
		Runnable runnable2 = () ->{
			System.out.println("Runnable example with lambda exp.\"");
		};
		Thread t2 = new Thread(runnable2);
		t2.start();
	}

}
