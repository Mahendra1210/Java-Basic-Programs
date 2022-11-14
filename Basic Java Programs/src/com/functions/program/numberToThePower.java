package com.functions.program;

import java.util.Scanner;

public class numberToThePower {
	
	public static void powerfunc(int x, int n) {
		
		System.out.println(Math.pow(x, n));
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		int x = sc.nextInt();
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		
		System.out.print("x to to the power of n is:");
		powerfunc(x,n);
		sc.close();
	}

}
