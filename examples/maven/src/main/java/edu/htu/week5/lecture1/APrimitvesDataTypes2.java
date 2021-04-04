package edu.htu.week5.lecture1;

public class APrimitvesDataTypes2 {
	public static void main(String[] args) {
		int n1=20;
		int n2=10;
		int n3=7;
		
		System.out.println(n1+n2);//30
		System.out.println(n1*n2);//200
		System.out.println(n1/n2);//2
		System.out.println(n1-n2);//10
		System.out.println(n1%n2);//0
		System.out.println(n1%n3);//6
		n1++;
		System.out.println(n1);//21
		n2--;
		System.out.println(n2);//9
		n2=n2+15;
		n2+=15;//39
		System.out.println(n2);//39
		
		System.out.println(n3++);//7: post increment: take the current value, then increment
		System.out.println(n3);//8
		
		System.out.println(++n2);//40 pre-increment, increment then take the current value
		System.out.println(n2);//40
	}
}
