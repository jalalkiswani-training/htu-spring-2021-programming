package edu.htu.weekz10.lecture1;

//Inheritance: extends keyword
//Student: child/subclass
//Person: parent/super class
public class Student extends Person {
	double gpa;

	@Override
	public void sayHello() {
		System.out.println("Hello, my name is :" + name + ", my age is : " + age + 
				" and my GPA is: " + gpa);
	}

	public void sayHelloWithGpa() {
		System.out.println("Hellom, my GPA is: " + gpa);
	}

}
