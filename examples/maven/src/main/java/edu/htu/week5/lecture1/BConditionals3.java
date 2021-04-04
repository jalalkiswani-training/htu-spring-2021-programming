package edu.htu.week5.lecture1;

import javax.swing.JOptionPane;

public class BConditionals3 {
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("N1"));// 10
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("N2"));// 5
		System.out.println("========================================");
		System.out.println("1- Add");
		System.out.println("2- Sub");
		System.out.println("3- Mul");
		System.out.println("4- Div");
		System.out.println("5- Quit");
		System.out.println("========================================");
		int ch = Integer.parseInt(JOptionPane.showInputDialog("Please Enter your choice"));// 1
		switch (ch) {
		case 1:
			System.out.println(n1 + n2);
			break;
		case 2:
			System.out.println(n1 - n2);
			break;
		case 3:
			System.out.println(n1 * n2);
			break;
		case 4:
			System.out.println(n1 / n2);
			break;
		case 5:
			System.out.println("Good Bye");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
}
