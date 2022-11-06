package com.basic.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 boolean isprime = true;
		
		for(int i=2; i<=n/2; i++) {
			
			if(n%i == 0) {
			isprime = false;
			break;
			}
		}	
			if(isprime) {
				if(n==1) {
					System.out.println(n +" is neither prime nor composite");
				}else {
					System.out.println(n +" is a prime number");
				}
				
			} else {
				System.out.println(n +" is not a prime number");
			}
		sc.close();
	}
}
