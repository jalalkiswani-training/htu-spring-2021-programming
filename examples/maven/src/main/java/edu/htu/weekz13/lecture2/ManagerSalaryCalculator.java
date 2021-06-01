package edu.htu.weekz13.lecture2;

public class ManagerSalaryCalculator {
	public static void main(String[] args) {
		int x = EmployeeSalaryCalculator.calculateEmployeeSalary(100, 50, 10);
		x=x+1000;
		System.out.println(x);
	}
}
