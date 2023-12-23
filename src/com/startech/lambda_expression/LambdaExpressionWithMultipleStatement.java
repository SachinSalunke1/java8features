package com.startech.lambda_expression;

interface IAverage {
	double avg(int[] a);
}

public class LambdaExpressionWithMultipleStatement {

	public static void main(String[] args) {

		// without Lambda Expression
		IAverage average = new IAverage() {

			@Override
			public double avg(int[] a) {
				int size = a.length;
				double sum = 0;
				double avg = 0;
				for (int i = 0; i < size; i++) {
					sum = sum + a[i];
				}
				return avg = sum / size;
			}
		};
		int[] array = { 1, 4, 6, 8, 9 };
		System.out.println(average.avg(array));

		// With Lambda Expression
		IAverage average2 = (la) -> {
			int size = la.length;
			double avg = 0;
			double sum = 0;
			for (int i = 0; i < size; i++) {
				sum = sum + la[i];
			}
			return avg = sum / size;
		};
		System.out.println(average2.avg(array));
	}

}
