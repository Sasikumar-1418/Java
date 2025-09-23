package array.index;

import java.util.*;

public class CountingfrequencyinArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(10);
		arr.add(10);
		arr.add(20);
		arr.add(20);
		arr.add(10);
		
		System.out.println("Printing the values of Array: "+arr);
		
		int Count1 = Collections.frequency(arr, Integer.valueOf(10));
		int count2 = Collections.frequency(arr, Integer.valueOf(20));
		
		System.out.println("Count of the first values: "+Count1);
		System.out.println("Count of the first values: "+count2);
	}

}
