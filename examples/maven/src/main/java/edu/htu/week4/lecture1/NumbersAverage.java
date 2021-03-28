package edu.htu.week4.lecture1;

import java.util.Scanner;

public class NumbersAverage {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("N1: ");
		int n1=s.nextInt();
		System.out.println("N2: ");
		int n2=s.nextInt();
		System.out.println("N3: ");
		int n3=s.nextInt();
		int sum=n1+n2+n3;
		int avg=sum/3;
		
		System.out.println(avg);
	}
}
