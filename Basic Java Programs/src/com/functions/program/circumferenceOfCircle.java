package com.functions.program;

import java.util.Scanner;

public class circumferenceOfCircle {
	
	public static double circumOfCircle(int r) {
		
	double circumference = 2*3.14*r;
	return circumference;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		System.out.print("The circumference of circle is : "+circumOfCircle(r));
		sc.close();
	}

}
