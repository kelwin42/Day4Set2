package com.trenser.training;

import java.util.Scanner;

public class Problem3 {

	public static int[] getMergedArray(int[] arr1, int[] arr2) {

		int i = 0, j = 0, k = 0;
		int[] arr3 = new int[arr1.length + arr2.length];

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}

		while (i < arr1.length)
			arr3[k++] = arr1[i++];

		while (j < arr2.length)
			arr3[k++] = arr2[j++];

		return arr3;
	}

	public static void main(String[] args) {
		int arr1Size, arr2Size;

		Scanner scan = new Scanner(System.in);

		System.out.print("Size of array 1: ");
		arr1Size = scan.nextInt();
		
		System.out.print("Size of array 2: ");
		arr2Size = scan.nextInt();

		int arr1[] = new int[arr1Size];
		int arr2[] = new int[arr2Size];


		System.out.print("Element of array 1: ");
		for (int i = 0; i < arr1Size; i++)
			arr1[i] = scan.nextInt();


		System.out.print("Element of array 2: ");
		for (int i = 0; i < arr2Size; i++)
			arr2[i] = scan.nextInt();

		scan.close();

		int rs[] = getMergedArray(arr1, arr2);

		System.out.print("Merged sorted array: ");
		for (int i = 0; i < rs.length; i++)
			System.out.print(rs[i] + ", ");

	}
}
