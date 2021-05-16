package edu.htu.weekz11.lecture1;

public class Test {
	public static void main(String[] args) {
		//Car: datatype
		//c: variable name / reference
		//new Car(): object construction		
		Car c=new Car(); 
		c.model="Mercedes";
		c.year=2015;
		c.vin="123456789654";
		
		c.showInfo();
		c.start();
		c.stop();
		
		System.out.println("Done!!");
	}
}
