package com.trenser.training;

import java.util.Scanner;

public class Problem19 {

	public static void main(String[] args) {
		int row, column;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter row count : ");
		row = scan.nextInt();

		System.out.print("Enter column count : ");
		column = scan.nextInt();

		int[][] matrix = new int[row][column];

		System.out.print("Input value of matrix : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		scan.close();

		System.out.println("Transpose of matrix : ");
		int[][] transpose = new int[column][row];

		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}

		for (int[] is : transpose) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
	}

}
