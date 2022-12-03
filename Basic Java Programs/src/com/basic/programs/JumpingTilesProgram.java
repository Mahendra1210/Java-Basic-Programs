package com.basic.programs;

import java.util.Scanner;

public class JumpingTilesProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 7;
		char choice;
		do {
			int num = sc.nextInt();
			if(num > 0) {
				System.out.println(++n);
				
			} else if (num < 0) {
				System.out.println(--n);
				
			} else {
				System.out.println("Invalid");
			}
			
			System.out.println("Continue again  y/n ?");
			choice = sc.next().charAt(0);
		}while(choice == 'y' || choice =='y');
		sc.close();
	}

}
