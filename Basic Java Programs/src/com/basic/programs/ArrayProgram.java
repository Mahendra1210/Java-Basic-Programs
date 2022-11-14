package com.basic.programs;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String name[] = new String[size];
		
		// for taking input name
		for(int i=0; i<size; i++) {
			name[i] = sc.next();
		}
		
		//for output
		for(int i=0; i<size; i++) {
			System.out.println(name[i]);
		}
		sc.close();
	}

}
