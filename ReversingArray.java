package array.index;

import java.util.Arrays;

public class ReversingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 20, 30, 40, 50};
		
		System.out.println("Original Array: "+Arrays.toString(array));
		
		int n = array.length;
		
		int[] rev = new int[n];
		
		for(int i=0; i<array.length;i++) {
			rev[i] = array[n-1-i];
		}
		
		System.out.println("Rverse the Array: "+Arrays.toString(rev));
	}

}
