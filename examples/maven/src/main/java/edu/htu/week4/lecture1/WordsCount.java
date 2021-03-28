package edu.htu.week4.lecture1;

import javax.swing.JOptionPane;

public class WordsCount {
	public static void main(String[] args) {
		String statement=JOptionPane.showInputDialog("Enter a statement");
		char[] arr=statement.toCharArray();	
		int sum=1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==' ') {
				sum++;
			}
		}
		System.out.println("Words count :"+sum);
	}
}
