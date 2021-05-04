package edu.htu.week9.lecture1;

import javax.swing.JOptionPane;

public class MethodPractice2 {

	public static void main(String[] args) {
		double [] grades=read();
		double output=calculateAvg(grades);
		printAvg(output);
		
		
	//	printAvg(calculateAvg(read()));
		
		

	}

	public static double[] read() {
		int size=Integer.parseInt(JOptionPane.showInputDialog("enter number of grades"));
		double [] grades=new double[size];
		for(int i=0; i<grades.length;i++) {
			grades[i]=Double.parseDouble(JOptionPane.showInputDialog("enter a grade"));
		}
		
		return grades;
		
	}
	
	public static double calculateAvg(double[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum/array.length;
	}
	
	public static void printAvg(double output) {
		System.out.println("The average is "+output);
		
	}
}
