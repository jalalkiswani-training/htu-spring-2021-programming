package edu.htu.weekz10.lecture1;

public class Test {
	public static void main(String[] args) {
		//Person: datatype - class name
		//p: variable (in the case of class -> reference)
		//new Person(): construction
		Person p=new Person();
		p.name="Ata";
		p.age=50;
		
		p.sayHello();
		p.sayHello(true);
		
		
		Student s=new Student();
		s.name="Lucy";
		s.age=20;
		s.gpa=99;
		s.sayHello();
		s.sayHelloWithGpa();
		
	}
}
