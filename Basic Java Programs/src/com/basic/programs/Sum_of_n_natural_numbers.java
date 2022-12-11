package com.basic.programs;
import java.util.*;

public class Sum_of_n_natural_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //for user input
		
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		int sum=0;
		
		//for loop
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
		sc.close();
	}

}
