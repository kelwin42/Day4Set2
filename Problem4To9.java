package com.trenser.training;

public class Problem4To9 {

	public static void traversal(int[] arr) {

		System.out.print("Traversing array : ");

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static int[] insert(int[] arr, int position, int element) {

		int[] arr2 = new int[arr.length + 1];
		int i = 0, j = 0;

		while (i < arr.length && j < arr2.length) {

			if (position == arr.length + 1) {
				arr2[position - 1] = element;
			}

			if (j == position - 1) {
				arr2[j++] = element;
			} else {
				arr2[j++] = arr[i++];
			}

		}

		return arr2;
	}

	public static int[] delete(int[] arr, int element) {

		int[] arr2 = new int[arr.length - 1];
		boolean eleFound = false;

		for (int i = 0, j = 0; i < arr.length; i++, j++) {

			if (arr[i] == element) {
				eleFound = true;
				j--;
			} else {
				arr2[j] = arr[i];
			}

		}

		if (!eleFound) {
			return arr;
		}

		return arr2;
	}

	public static int search(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i + 1;
			}
		}

		return -2;
	}

	public static int[] update(int[] arr, int position, int element) {

		arr[position - 1] = element;

		return arr;
	}

	public static void main(String[] args) {
		int[] myarray = new int[] { 10, 23, 34, 56, 77, 89 };

		traversal(myarray);

		System.out.println("After inserting 25 at position 3 ");
		myarray = insert(myarray, 3, 25);
		traversal(myarray);

		System.out.println("After deleting 56 ");
		myarray = delete(myarray, 56);
		traversal(myarray);

		int presentAt = search(myarray, 23);
		if (presentAt > 0) {
			System.out.println("The entered element is in position " + presentAt);
		} else {
			System.out.println("The entered element is not present in the array");
		}

		System.out.println("After inserting element 44 at position 2 ");
		myarray = update(myarray, 2, 44);
		traversal(myarray);
	}

}
