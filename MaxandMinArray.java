package array.index;

import java.util.Arrays;

public class MaxandMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12, 5, 7, 89, 34};
		
		Arrays.sort(a);
		
		System.out.println("Complete Array:" + Arrays.toString(a));
		
		System.out.println("Min of Array: "+a[0]);
		
		System.out.println("Max of Array: "+a[a.length-1]);
		
		System.out.println("2nd Min of Array: "+a[1]);
		
		System.out.println("2nd Max of Array: "+a[a.length-2]);
		
	}

}
