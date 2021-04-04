package edu.htu.week5.lecture1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BConditionals1 {
	public static void main(String[] args) {
		String n1Str = JOptionPane.showInputDialog("Please enter number 1");// 10
		int n1 = Integer.parseInt(n1Str);

		String n2Str = JOptionPane.showInputDialog("Please enter number 2");// 10
		int n2 = Integer.parseInt(n2Str);

		int sum = n1 + n2;

		System.out.println("Sum =" + sum);
		// if(condition) { // condition should always return true or false
		if (n1 > n2) {
			System.out.println("N1 is bigger");
		} else if (n2 > n1) {
			System.out.println("N2 is bigger");
		} else {
			System.out.println("N1 is equal to N2");
		}
		System.out.println("Done");
	}
}
