package com.recursion.program;

public class Factorial {
	
	public static int FactOfNum(int n) {
		
		if(n == 0 || n == 1) {
			return 1;
		}
		int factnM1 = FactOfNum(n-1);
		int fact = n*factnM1;
		return fact;
	}
	public static void main(String[] args) {
		
		int n = 5;
		int res = FactOfNum(n);
		System.out.println(res);
	}
}
