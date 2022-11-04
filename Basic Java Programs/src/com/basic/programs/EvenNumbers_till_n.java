package com.basic.programs;

import java.util.Scanner;

public class EvenNumbers_till_n {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		
		//for loop
		for(int i=0; i<=n; i++) {
			
			// if condition
			if(i%2 == 0) {
				System.out.print(i +" ");
			}
		}
		sc.close();
	}

}
