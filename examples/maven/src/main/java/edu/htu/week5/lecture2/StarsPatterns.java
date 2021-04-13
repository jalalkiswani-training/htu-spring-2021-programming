package edu.htu.week5.lecture2;

import javax.swing.JOptionPane;

public class StarsPatterns {

	public static void main(String[] args) {
	
		/*
		 * System.out.println("Hello From Hana"); System.out.println("Hello From Hana");
		 * System.out.println("Hello From Hana"); System.out.println("Hello From Hana");
		 * System.out.println("Hello From Hana"); System.out.println("Hello From Hana");
		 * System.out.println("Hello From Hana"); System.out.println("Hello From Hana");
		 * System.out.println("Hello From Hana");
		 */
		
		
		// steps initial value i=0
		// check , condition true -> body -> update i 
		// condition false, 
		/*for (int i = 0; i < 5; i++) {
			System.out.println("Hello From Hana");
			
		}
		*/
		
		
		int n=Integer.parseInt(JOptionPane.showInputDialog("Please enter number of stars"));
		System.out.println("number of stars is "+ n);
		
		
		System.out.println("horizontal ");
		System.out.println("===================================");
		for(int i=0;i<n;i++) {
			System.out.print("* ");
		}
		
		System.out.println();
		System.out.println("vertical");
		System.out.println("===================================");
		for(int i=0;i<n;i++) {
			System.out.println("*");
		}
		
		System.out.println();
		System.out.println("Square");
		System.out.println("===================================");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Traingle 1");
		System.out.println("===================================");
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		System.out.println();
		System.out.println("Triangle 2");
		System.out.println("===================================");
		
		// method 1 
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n;j++) {
				if(j<n-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("===================================");
		// method 2
		for(int i=0;i<n;i++) {
			for(int j=2*(n-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("==================================="); 
		// method 3
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("square empty diagonal left to right");
		System.out.println("==================================="); 
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Square empty diagonal right to left");
		System.out.println("==================================="); 
		
		// method 1 
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n-(i+1)) {
					System.out.print(" ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Square empty diagonal right to left");
		System.out.println("==================================="); 
		// method 2 
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j!=n) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("Square empty diagonal right to left");
		System.out.println("==================================="); 
		// method 3 
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==(i-n)*-1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
