package com.sorting.programs;

public class QuickSort {
	
	public static void printArray(int A[], int n) {
		
		for(int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("");
	}
	
	public static int partition(int A[], int low, int high) {
		
		int pivot = A[high];
		int i = low-1;
		
		for(int j = low; j < high; j++) {
			if(A[j] < pivot) {
				i++;
				
				//swap
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		//swap with pivot
		i++;
		int temp = A[i];
		A[i] = A[high];
		A[high] = temp;
		return i;
	}
	public static void quickSort(int A[],int low, int high) {
		int partitionIndex; // Index of pivot after partition
		
		if(low < high) {
		partitionIndex = partition(A,low,high);
		quickSort(A, low, partitionIndex-1); // sort left subarray
		quickSort(A, partitionIndex+1, high); // sort right subarray
		}
	}
	public static void main(String[] args) {
		
		int A[] = {4,8,9,7,6,3,2};
		int n = A.length;
		printArray(A,n);
		quickSort(A,0,n-1);
		printArray(A,n);

	}
}
