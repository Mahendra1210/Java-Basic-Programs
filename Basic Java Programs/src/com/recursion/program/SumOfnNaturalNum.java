package com.recursion.program;

public class SumOfnNaturalNum {
	
	public static void PrintSum(int a, int sum) {
		
		if(a==0) {
			sum += a;
			System.out.println(sum);
			return;
		}
		
		sum += a;
		PrintSum(a-1,sum);
	}

	public static void main(String[] args) {
		
		PrintSum(3,0);
		
	}

}
