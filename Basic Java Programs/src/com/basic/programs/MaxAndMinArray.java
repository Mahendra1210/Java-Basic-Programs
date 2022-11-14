package com.basic.programs;

import java.util.Scanner;

public class MaxAndMinArray {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int num[] = new int[size];

	// for input
	for(int i=0; i<num.length; i++) {
		num[i] = sc.nextInt();	
	}
	
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	
	for(int i=0; i<num.length; i++) {
		
		if(num[i] < min) {
			 min = num[i];
		}
		
		if(num[i] > max) {
			max = num[i];
		}
	}
	
	System.out.println("largest number is: "+max);
	System.out.println("smallest number is: "+min);
	
	sc.close();
	
	}
}
