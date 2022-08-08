package com.trenser.training;

public class Problem24 {

	public static int[] productExceptSelf(int[] x) {
		int[] p = new int[x.length];

		for (int i = 0; i < x.length; i++) {
			p[i] = 1;
			for (int j = 0; j < x.length; j++) {
				if (i != j)
					p[i] *= x[j];
			}
		}

		return p;
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5 };

		int[] product = productExceptSelf(arr);
		
		for (int i : product) {
			System.out.print(i + " ");
		}

	}
}
