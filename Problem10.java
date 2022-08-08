package com.trenser.training;

public class Problem10 {

	public static long convertDecimalToBinary(int decimal) {
		long binary = 0;
		int rem, i = 1;

		while (decimal != 0) {
			rem = decimal % 2;
			decimal /= 2;
			binary += rem * i;
			i *= 10;
		}

		return binary;
	}

	public static long convertBinaryToDecimal(long binary) {
		int decimal = 0, i = 0;
		long rem;

		while (binary != 0) {
			rem = binary % 10;
			binary /= 10;
			decimal += rem * Math.pow(2, i);
			++i;
		}

		return decimal;
	}

	public static long convertOctalToDecimal(long octal) {
		int decimal = 0, i = 0;
		long rem;

		while (octal != 0) {
			rem = octal % 10;
			octal /= 10;
			decimal += rem * Math.pow(8, i);
			++i;
		}

		return decimal;
	}

	public static long convertDecimalToOctal(long decimal) {
		long binary = 0, rem;
		int i = 1;

		while (decimal != 0) {
			rem = decimal % 8;
			decimal /= 8;
			binary += rem * i;
			i *= 10;
		}

		return binary;
	}

	public static long convertBinaryToOctal(long binary) {
//		int octal = 0, i = 0;
//		long rem;
//
//		while (binary != 0) {
//			rem = binary % 10;
//			binary /= 10;
//			octal += rem * Math.pow(8, i);
//			++i;
//		}
//
//		return octal;

		return convertDecimalToOctal(convertBinaryToDecimal(binary));
	}
	
	public static long convertOctalToBinary(long Octal) {
		return convertDecimalToBinary((int) convertOctalToDecimal(Octal));
	}

	public static void main(String[] args) {

		System.out.println(convertBinaryToDecimal(1101011));
		System.out.println(convertDecimalToBinary(107));
		System.out.println(convertOctalToDecimal(15));
		System.out.println(convertDecimalToOctal(13));
		System.out.println(convertBinaryToOctal(1111));
		System.out.println(convertOctalToBinary(17));
	}
}
