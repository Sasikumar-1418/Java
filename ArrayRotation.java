package array.index;

import java.util.*;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("User,please make the input for size of an array::");
		
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		
		System.out.println("User, Please enter the values of an array");
		
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("User, Please double check your input values::"+Arrays.toString(arr));
		
		System.out.println("User, please make the input for how many rotate you need to do array from last");
		
		int b = sc.nextInt();
		
		int[] temp = new int[b];
		
		for(int i=0;i<b;i++) {
			temp[i] = arr[a-1-i];
		}
		
		for (int i = a - 1; i >= b; i--) {
            arr[i] = arr[i - b];
        }

        // Step 3: put temp elements at the beginning
        for (int i = 0; i < b; i++) {
            arr[i] = temp[i];
        }
        
        System.out.println("After rotated the array: "+Arrays.toString(arr));
        
        sc.close();
	}

}
