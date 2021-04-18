package edu.htu.week7.lecture1;

import java.util.Scanner;

public class ArraysTest_V2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int values[] = new int[5];// array construction
		for (int i = 0; i < values.length; i++) {
			System.out.println("Enter Number " + (i + 1) + ":");
			values[i] = s.nextInt();
			sum = sum + values[i];
		}
		System.out.println("Your values are ");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i]);
			if (i != values.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println();
		System.out.println("Sum = " + sum);
	}
}
