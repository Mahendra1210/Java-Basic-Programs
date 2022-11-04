package com.basic.programs;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Select operator number : ");
		int operator = sc.nextInt();
		
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt(); //input
		System.out.print("Enter the value of b : ");
		int b = sc.nextInt(); //input
		
		//Switch case
		switch(operator) {
		
		case 1 : System.out.println("Addition is : " + a + b);
		  		 break;
		case 2 : System.out.println("Substraction is : " + (a - b));
 		 		 break;
		case 3 : System.out.println("Multiplication is : " + a * b);
 		 		 break;
		case 4 : if(b == 0) {
					System.out.println("Invalid Division");
				 } else {
					System.out.println("Division is : " + a / b);
				 }
				 break;
		case 5 : if(b == 0) {
					System.out.println("Invalid Divisor");
		 		 } else {
		 			System.out.println("Remainder is : " + a % b);
		 		 }
 		 	     break;
 		default : System.out.println("Invalid operator"); 	     
		}
		sc.close();
	}

}
