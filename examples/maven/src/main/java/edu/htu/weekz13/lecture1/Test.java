package edu.htu.weekz13.lecture1;

public class Test {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		int x = i + j;
		int y = x - i;
		x = calculateX(x, y);
		
		System.out.println("i=" + i);// 10
		System.out.println("j=" + j);// 20
		System.out.println("y=" + y);// 20, 30,
		System.out.println("x=" + x);// 620
	}

	private static int calculateX(int x, int y) {
		x = x * 20 + y;
		x = y * 30 / 10;
		x = x + 7;
		return x;
	}
}
