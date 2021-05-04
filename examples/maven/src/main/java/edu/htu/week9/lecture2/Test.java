package edu.htu.week9.lecture2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		/*
		 * Person: class name (datatype)
		 * p: variable name (reference)
		 * new Person(): construction of Objects
		 */
		Person p1 = new Person();
		p1.name="Ata";
		p1.age=20;
		p1.sayHello();//	Ata
		
		Person p2=new Person();
		p2.name="Eman";
		p2.age=18;
		
		p2.sayHello();//Eman
		
		p1.name="Essa";
		p1.sayHello();//Ata
		
	}
}
