package array.index;

import java.util.*;

public class ArraySwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7};
		System.out.println("Initial Array: "+Arrays.toString(a));
		int temp;
		
		for(int i=0;i<a.length/2;i++) {
		
		temp=a[i]; //Initial assign to temp
		a[i]=a[a.length-1-i];
		a[a.length-1-i]=temp;   //5,
		}
		
		System.out.println("Swap Array: "+Arrays.toString(a));
		
	}

}
