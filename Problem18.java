package com.trenser.training;

import java.util.Scanner;

public class Problem18 {
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];

		int k = 0;

		for (int i : arr1)
			merged[k++] = i;

		for (int i : arr2)
			merged[k++] = i;

		return merged;
	}

	public static void main(String[] args) {
		int size = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter size of array 1 : ");
		size = scan.nextInt();

		int arr1[] = new int[size];

		System.out.print("Enter size of array 2 : ");
		size = scan.nextInt();

		System.out.print("Enter elements of array 1 : ");
		int arr2[] = new int[size];

		for (int i = 0; i < arr1.length; i++)
			arr1[i] = scan.nextInt();

		System.out.print("Enter elements of array 2 : ");
		for (int i = 0; i < arr2.length; i++)
			arr2[i] = scan.nextInt();

		scan.close();

		int[] merged = merge(arr1, arr2);

		System.out.print("Merged array : ");
		for (int i : merged)
			System.out.print(i + " ");

	}
}
