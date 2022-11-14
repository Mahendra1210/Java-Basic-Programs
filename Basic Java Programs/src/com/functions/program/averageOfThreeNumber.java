package com.functions.program;

import java.util.Scanner;

public class averageOfThreeNumber {
	
	//function for calculating average 
	public static int averageOfNum(int a, int b, int c) {
	int avg = (a+b+c)/3;
	return  avg;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //for user input
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.print("The average of 3 number is : "+averageOfNum(a,b,c));
		sc.close();
	}
}
