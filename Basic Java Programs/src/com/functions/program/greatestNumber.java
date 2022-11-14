package com.functions.program;

import java.util.Scanner;

public class greatestNumber {
    // function for greatest number
	public static int greatestNum(int a, int b) {
		// if condition
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // for user input
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.print("The greatest number is : "+greatestNum(a,b));
		sc.close();
	}
}
