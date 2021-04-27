package edu.htu.week8.lecture2;

import javax.swing.JOptionPane;

public class Example1 {
	public static void main(String[] args) {
		int n1=readNumber();
		int n2=readNumber();
		int n3=readNumber("Please enter number 3");
		
		int sum = n1 + n2 + n3;
		System.out.println(sum);
	}

	/*
	 * public (visibility modifier), can be accessed from anywhere
	 * static: can be called directly 
	 * int: return data type
	 * readNumber: function name (camel case with smallFirst)
	 * (String msg): paramter
	 * 
	 */
	public static int readNumber(String msg) {
		String numStr = JOptionPane.showInputDialog(msg);
		int n = Integer.parseInt(numStr);
		return n;		
	}
	
	/*
	 * Having two functions/methods with the same name in the same class but are different in parameters (Method overloading)
	 */
	public static int readNumber() {
		return readNumber("Please enter number");
	}
}
