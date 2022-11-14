package com.functions.program;

import java.util.Scanner;

public class sumOfOddNumbers {
	
	//function for sum of odd numbers till n
	public static int sumOfOddNum(int n) {
		int sum = 0;
		
		//for loop
		for(int i=1; i<=n; i++) {
			//if condition
			if(i%2 != 0) {
				sum = sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //for user input
		int n = sc.nextInt();
		
		System.out.print("The sum of odd number till " +n +" is : "+sumOfOddNum(n));
		sc.close();
	}
}
