package com.sorting.programs;
public class MergeSort {
	
	public static void printArray(int A[], int n) {
		
		// to print the sorted array
		for(int i = 0; i < n; i++) {
			System.out.print(A[i]);
		}
		System.out.println();
		
	}
	
	public static void Merge(int A[],int low, int mid, int high) {
		
		// dividing process of an array 
		int i,j,k;
		int B[] = new int [high+1];
		i = low;
		j = mid + 1;
		k = low;
		
		while( i <= mid && j <= high ) {
			if(A[i] < A[j]) {
				B[k] = A[i];
				i++;k++;
			}else {
				B[k] = A[j];
				j++;k++;
			}
		
		}
		
		while(i <= mid) {
			B[k] = A[i];
			k++;i++;
		}
		
		while(j<=high) {
			B[k] = A[j];
			k++;j++;
		}
		
		//to print sorted array in original array
		for( i = low; i <= high; i++) {
			A[i] = B[i];
		}
	}
	public static void MS(int A[], int low, int high) {

		int mid;
		if(low<high) {
		 mid = (low+high)/2;
		MS(A,low,mid);
		MS(A,mid+1,high);
		Merge(A,low,mid,high);
		}	
	}
	public static void main(String[] args) {
		
		int A[] = {4,2,3,8,9,10};
		int n = A.length;
		printArray(A,n);
		MS(A,0,n-1);
		printArray(A,n);
		
	}

}
