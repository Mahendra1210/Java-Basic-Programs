package com.pattern.programs;

public class Hollow_rectangle {

	public static void main(String[] args) {
		
	int n = 4;
	int m = 5;
	
	//outer for loop
	for(int i=1; i<=n; i++) {
		//inner for loop
		for(int j=1; j<=m; j++) {
			//if condition
			if(i==1 || j==1 || i==4 || j==5) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
  }
}
