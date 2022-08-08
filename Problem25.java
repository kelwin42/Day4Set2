package com.trenser.training;

public class Problem25 {
	public static int getFactorial(int number) {
		int factorial = 1;
		for (int i = number; i > 0; i--)
			factorial *= i;
		return factorial;
	}

	public static int trailingZeroes(int number) {
		int zeros = 0;

		while (number % 10 == 0 && number > 0) {
			zeros++;
			number /= 10;
		}

		return zeros;
	}

	public static void main(String[] args) {
		int num = 5;

		System.out.println(trailingZeroes(getFactorial(num)));

		System.out.println(trailingZeroes(67006000));

	}

}
