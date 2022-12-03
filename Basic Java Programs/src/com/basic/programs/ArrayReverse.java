package com.basic.programs;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {
	
	public static void reverse(Integer a[]) {
		
		Collections.reverse(Arrays.asList(a));
		System.out.print(Arrays.asList(a));
		
	}

	public static void main(String[] args) {
	
		Integer arr[] =  {1,2,3,4,5};
		reverse(arr);
		
		}
	}


