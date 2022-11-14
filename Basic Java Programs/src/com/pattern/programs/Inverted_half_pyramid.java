package com.pattern.programs;

public class Inverted_half_pyramid {

	public static void main(String[] args) {
		int n = 4;
		
		for(int i=0; i<=n; i++) {    //for(int i=n; i>=1; i--) another method
			for(int j=i; j<n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
