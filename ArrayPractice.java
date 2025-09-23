package array.index;

import java.util.*;


public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {50,40,30,20,10};
		
		System.out.println("Printing the initial Array: "+Arrays.toString(arr));
		
		double sum =0;
		for(int i=0;i<arr.length;i++) {
			sum+= arr[i];
		}
		
		System.out.println("Sum of all values in the array: "+sum);
		System.out.println("Average of the given array: "+sum/arr.length);
		Arrays.sort(arr);
		System.out.println("After Sorted Array: "+Arrays.toString(arr));
		
		boolean ascending = true;
		boolean descending = true;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				descending = false;
			}
			
			 if(arr[i]>arr[i+1]) {
				ascending = false;	
			}
		}
		if(ascending) {
			System.out.println("Values of array sorted in ascending: "+ ascending);
		}
		else if(descending) {
			System.out.println("Values of array sorted in descending: "+ descending);
		}
		else {
			System.out.println("Array is not properly sorted: ");
		}
		
		 
	}
	
}

