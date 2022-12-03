package com.sorting.programs;

public class SelectionSort {
	
	public static void PrintSortedArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {4,8,6,5,2,45,10};
		
		//Selection sort
		for(int i=0; i<arr.length-1; i++) {
			int smallest = i;
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[j] < arr[smallest]) { 
				smallest = j;
				}
			}
			//swap
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		PrintSortedArray(arr);
	}

}
