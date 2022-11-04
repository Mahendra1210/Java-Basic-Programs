package com.basic.programs;

import java.util.Scanner;

public class Menu_driven_program {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); // for user input
		int n;
		
		// do while loop
		do {
			System.out.println("Enter the marks of student : ");
			int marks = sc.nextInt();
			if(marks >= 90 && marks<=100) {
				System.out.println("This is good");
			}else if(marks<=89 &&(marks>=60)) {
				System.out.println("This is also good");
			}else if(marks<=59 &&(marks>=0)) {
				System.out.println("This is good as well");
			} else {
				System.out.println("Invalid marks");
			}
			
			System.out.println("Want to continue ? (yes(1) or no(0)"); // to continue the loop or not
			 n = sc.nextInt();
		}while(n==1);
		
		sc.close();
	}

}
