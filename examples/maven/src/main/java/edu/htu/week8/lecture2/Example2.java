package edu.htu.week8.lecture2;

public class Example2 {
	public static void main(String[] args) {
		int n1 = Example1.readNumber();
		int n2 = Example1.readNumber();

		double avg = (double) (n1 + n2) / 2;
		System.out.println(avg);
	}
}
