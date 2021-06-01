package edu.htu.weekz13.lecture2;

import java.util.Scanner;

public class EmployeeSalaryCalculator {
	///////////////////////////////////////////////////////
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		int basicSalary = scanner.nextInt();
		System.out.println("Enter deductions: ");
		int deductions = scanner.nextInt();
		System.out.println("Enter allownces: ");
		int allownces = scanner.nextInt();
		int finalSalary = calculateEmployeeSalary(basicSalary, deductions, allownces);
		
		System.out.println(finalSalary);
	}
	
	///////////////////////////////////////////////////////
	public static int calculateEmployeeSalary(int basicSalary, int deductions, int allownces) {
		int finalSalary = basicSalary - deductions + allownces;
		return finalSalary;
	}
	///////////////////////////////////////////////////////
}
