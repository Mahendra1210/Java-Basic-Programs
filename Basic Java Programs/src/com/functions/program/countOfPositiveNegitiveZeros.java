package com.functions.program;

import java.util.Scanner;

public class countOfPositiveNegitiveZeros {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int countpositive = 0;
		int countnegative = 0;
		int countzero = 0;
		char choice;
		
		do {
			System.out.print("Enter the number : ");
			num = sc.nextInt();
			
			if(num > 0) {
				countpositive++;
			} else if(num < 0) {
				countnegative++;
			} else {
				countzero++;
			}
			
			System.out.println("Do you want to continue y/n?");
			choice = sc.next().charAt(0);
		} while(choice == 'y' || choice == 'Y');
		
		System.out.println("The number of positive numbers is: " +countpositive);
		System.out.println("The number of negative numbers is: " +countnegative);
		System.out.println("The number of zeros is: " +countzero);
		
		sc.close();
	}
}
 