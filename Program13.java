package com.trenser.training;

import java.util.Scanner;

public class Program13 {

	public static float getAverage(int[] arr) {
		int sum = 0;

		for (int i : arr) {
			sum = sum + i;
		}

		return (float) sum / arr.length;
	}
	
	public static int largestOfArray(int[] arr) {
		int largest = arr[0];
		
		for (int i : arr) {
			if(i>largest) {
				largest = i;
			}
		}
		
		return largest;
	}

	public static void main(String[] args) {
		int numberOfEle;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of elements : ");
		numberOfEle = scan.nextInt();

		int[] arr = new int[numberOfEle];

		System.out.println("Enter values : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("Average of numbers is : " + getAverage(arr));
		System.out.println("Largest of elements in the array is : " + largestOfArray(arr));

		scan.close();
	}

}
