package com.functions.program;

public class infiniteLoop {

	public static void infiloop(int a) {
		do {
			System.out.println("I'm in infinite loop");
		} while(a < 15);
	}
	public static void main(String[] args) {
		int a = 14;
		infiloop(a);
	
	}

}
