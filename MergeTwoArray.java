package array.index;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3};
		System.out.println("Array of 1: "+Arrays.toString(arr1));
		int[] arr2 = {4,5,6};
		System.out.println("Array of 2: "+Arrays.toString(arr2));
		
		int[] merged = new int[arr1.length+arr2.length]; //assigning the length of two array
		
		for(int i=0;i<arr1.length;i++) {
			merged[i]=arr1[i];
		}
		
		for(int j=0;j<arr2.length;j++) {
			merged[arr1.length+j] = arr2[j];
		}
		System.out.println("\n");
		System.out.println("Printing the values of two array: "+Arrays.toString(merged));
		
		
	}

}
