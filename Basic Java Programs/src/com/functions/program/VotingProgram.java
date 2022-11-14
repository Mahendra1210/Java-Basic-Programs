package com.functions.program;

import java.util.Scanner;

public class VotingProgram {
	
	public static void votingEligibility(int age) {
		
		if(age == 0) {
			System.out.print("Invalid age");
			return ;
		}
		if(age>18 ) {
			System.out.print("You are eligible to vote.");
		} else {
			System.out.print("You are not eligible to vote.");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		 votingEligibility(age);
		 sc.close();
	}
}
