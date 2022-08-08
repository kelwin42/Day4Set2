package com.trenser.training;

import java.util.Scanner;

public class Problem2 {

	public static int findOmitted(int[] arr) {
		boolean isMatched = true;
		int i;

		for (i = 1; i <= arr.length + 1 && isMatched; i++) {
			isMatched = false;
			for (int ele : arr) {
				if (i == ele) {
					isMatched = true;
					break;
				}
			}
		}

		return i - 1;
	}

	public static void main(String[] args) {
		int size;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size: ");
		size = scan.nextInt();

		int arr[] = new int[size - 1];


		System.out.print("Enter the elements in array: ");
		for (int i = 0; i < size - 1; i++)
			arr[i] = scan.nextInt();

		scan.close();
		
		System.out.println("Omitted element: " + findOmitted(arr));

	}
}
