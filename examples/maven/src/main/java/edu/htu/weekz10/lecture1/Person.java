package edu.htu.weekz10.lecture1;

import javax.swing.JOptionPane;

public class Person {
	// instance variables (attributes)
	String name;
	int age;

	// methods (actions)
	public void sayHello() {
		sayHello(false);
	}

	//method overload
	public void sayHello(boolean showInDialog) {
		if (showInDialog) {
			JOptionPane.showMessageDialog(null, "Hello, my name is :" + name + ", and my age is : " + age);
		}else {
			System.out.println("Hello, my name is :" + name + ", and my age is : " + age);	
		}
	}
}
