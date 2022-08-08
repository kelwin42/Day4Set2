package com.trenser.training;

import java.util.Scanner;

public class Problem15 {

	public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
		int[][] sum = new int[matrix1.length][matrix1[0].length];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int row, column;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of rows :");
		row = scan.nextInt();
		System.out.println("Enter number of columns :");
		column = scan.nextInt();

		System.out.println("Matrix 1 :");
		int[][] matrix1 = new int[row][column];
		System.out.println("Input values : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix1[i][j] = scan.nextInt();
			}
		}

		System.out.println("Matrix 2 :");
		int[][] matrix2 = new int[row][column];
		System.out.println("Input values : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix2[i][j] = scan.nextInt();
			}
		}

		int[][] resSum = addMatrix(matrix1, matrix2);

		for (int[] is : resSum) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}

		scan.close();
	}

}
