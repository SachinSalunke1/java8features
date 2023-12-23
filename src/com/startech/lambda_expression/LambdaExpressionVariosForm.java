package com.startech.lambda_expression;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExpressionVariosForm {

	public static void main(String[] args) {

		// Lambda with no parameters and no return value
		Runnable noParNoRet = () -> System.out.println("Lambda with no parameters and no return value");
		noParNoRet.run();
		System.out.println("-----------------------------------------------------------------");

		// Lambda with a single parameter and no type declaration
		Consumer<String> singleParNoType = s -> System.out.println(s);
		singleParNoType.accept("Lambda with a single parameter and no type declaration");
		System.out.println("-----------------------------------------------------------------");

		// Lambda with a single parameter and type declaration
		Consumer<String> singleParaAndType = (String s) -> System.out.println(s);
		singleParaAndType.accept("Lambda with a single parameter and type declaration");
		System.out.println("-----------------------------------------------------------------");

		// Lambda with multiple parameters, type inferred
		BiFunction<Integer, Integer, Integer> multiParaTypeInfered = (a, b) -> a + b;
		Integer result = multiParaTypeInfered.apply(4, 5);
		System.out.println("Lambda with multiple parameters, type inferred Result :" + result);
		System.out.println("-----------------------------------------------------------------");

		// Lambda with multiple parameters, type declared
		BiFunction<Integer, Integer, Integer> multiParaWithType = (Integer a, Integer b) -> a + b;
		Integer result1 = multiParaWithType.apply(4, 5);
		System.out.println("Lambda with multiple parameters, type declared :" + result1);
		System.out.println("-----------------------------------------------------------------");
		
		// Lambda with a return statement (multiple lines)
		BiFunction<Integer, Integer, Integer> multiParaWithMultiLine =(a,b)->{
			int sum =a+b;
			return sum;
		};
		Integer result2 = multiParaWithMultiLine.apply(4, 5);
		System.out.println("Lambda with a return statement (multiple lines) :"+result2);
		System.out.println("-----------------------------------------------------------------");
		
		// Lambda with no parameters and a return value
		Supplier<Integer> noParaAndReturnValue = ()-> 42;
		Integer result3 = noParaAndReturnValue.get();
		System.out.println("Lambda with no parameters and a return value :"+result3);
		System.out.println("-----------------------------------------------------------------");
}

}
