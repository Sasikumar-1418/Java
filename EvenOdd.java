package array.index;

import java.util.Scanner;

import java.util.Arrays;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("User! Please enter the size of array would like");
		
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		
		for(int i=0;i<a;i++) {
			System.out.println("User, Please enter the values for array");
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println("This is Array after entered the values: "+ Arrays.toString(arr));
		
		int countodd = 0;
		int counteven = 0;
		
		for(int k=0;k<a;k++) {
			if(arr[k]%2==0) {
				counteven++;
			}
			else {
				countodd++;
			}
		}
		
		System.out.println("Count of Even number in an array  is: "+counteven);
		System.out.println("Count of Odd number in an array  is: "+countodd);
		sc.close();
	}

}
