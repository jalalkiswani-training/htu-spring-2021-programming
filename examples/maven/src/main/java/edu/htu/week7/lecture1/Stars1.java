package edu.htu.week7.lecture1;

public class Stars1 {
	public static void main(String[] args) {
		int rows = 5;
		int cols = 5;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
