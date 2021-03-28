package edu.htu.week4.lecture1;

import javax.swing.JOptionPane;

public class SumTwoNumbersV2 {
	public static void main(String[] args) {
		String value1=JOptionPane.showInputDialog("Please enter number 1:");//5
		String value2=JOptionPane.showInputDialog("Please enter number 2:");//10
		
		int n1=Integer.parseInt(value1);
		int n2=Integer.parseInt(value2);
		
		System.out.println(value1+value2);//String concatenation
		System.out.println(n1+n2);//String concatenation
	}
}