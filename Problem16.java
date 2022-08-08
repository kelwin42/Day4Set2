package com.trenser.training;

import java.util.Scanner;

public class Problem16 {

	public static int[][] matrixMultiply(int[][] matrix1, int[][] matrix2) {
		int[][] mul = new int[matrix1.length][matrix2[0].length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				mul[i][j] = 0;
				for (int k = 0; k < matrix1[0].length; k++) {
					mul[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return mul;
	}

	public static void main(String[] args) {
		int row, column;

		Scanner scan = new Scanner(System.in);

		System.out.println("Matrix 1 :");
		System.out.println("Enter number of rows :");
		row = scan.nextInt();

		System.out.println("Enter number of columns :");
		column = scan.nextInt();

		int[][] matrix1 = new int[row][column];
		System.out.println("Input values : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix1[i][j] = scan.nextInt();
			}
		}

		System.out.println("Matrix 2 :");
		System.out.println("Enter number of rows :");
		row = scan.nextInt();

		System.out.println("Enter number of columns :");
		column = scan.nextInt();
		int[][] matrix2 = new int[row][column];
		if (row == matrix1[0].length) {
			System.out.println("Input values : ");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					matrix2[i][j] = scan.nextInt();
				}
			}
		} else {
			System.out.println("Rows of matrix1 and columns of matrix2 should be equal ");
		}

		int[][] resMul = matrixMultiply(matrix1, matrix2);

		for (int[] is : resMul) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}

		scan.close();
	}

}
