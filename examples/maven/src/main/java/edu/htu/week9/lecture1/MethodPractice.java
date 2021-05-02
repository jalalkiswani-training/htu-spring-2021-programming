package edu.htu.week9.lecture1;

public class MethodPractice {

	public static void main(String[] args) {
		sayHello();
		sayHello("Sara");

	}
	
	
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello from "+ name);
		
	}
	
	

}
