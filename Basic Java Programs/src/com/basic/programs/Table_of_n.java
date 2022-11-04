package com.basic.programs;

import java.util.Scanner;

public class Table_of_n {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //for user input
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=10; i++ ) {
			
			System.out.println(n*i);
		}
		sc.close();
	}

}
