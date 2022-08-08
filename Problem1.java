package com.trenser.training;

import java.util.Scanner;

public class Problem1 {
	public static int[] findArraySum(int[] arr, int expectedSum) {
		int sum = 0, i, j;

		for (i = 0; i < arr.length - 1; i++) {
			for (j = i; j < arr.length; j++) {
				sum += arr[j];

				if (sum == expectedSum) {
					return new int[] { i + 1, j + 1 };
				}
			}
		}

		return new int[0];
	}

	public static void main(String[] args) {
		int size, expectedSum;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter size of array N: ");
		size = scan.nextInt();

		System.out.print("Enter the expected sum S: ");
		expectedSum = scan.nextInt();

		int arr[] = new int[size];


		System.out.print("Enter elements of array : ");
		for (int i = 0; i < size; i++)
			arr[i] = scan.nextInt();

		scan.close();

		int[] rs = findArraySum(arr, expectedSum);
		
		System.out.println(rs[0] + "  " + rs[1]);
	}
}
