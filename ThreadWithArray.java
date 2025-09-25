package Thread;

import java.util.*;

class MaxThread extends Thread{	
	private int[] arr;
	
	MaxThread(int[] arr){
		this.arr = arr;
	}
	
	public void run() {
		int max = arr[arr.length-1];
		System.out.println("Max of an Array ->"+max);
	}
}

class MinThread extends Thread{
	private int[] arr;
	
	MinThread(int[] arr){
		this.arr = arr;
	}
	
	public void run() {
		int min = arr[0];
		System.out.println("Max of an Array ->"+min);
	}
	
}

public class ThreadWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); //Scanner to get input from user
		
		System.out.println("Enter the size of an array want to create ->");
		int a = sc.nextInt();
		
		int[] max = new int[a];  //assigning here the size
		
		System.out.println("Enter the values of an array ->");
		
		for(int i=0;i<a;i++) {
			max[i] = sc.nextInt();
		}
		
		System.out.println("Check the entered values of an Array -> "+Arrays.toString(max));
		
		Arrays.sort(max); //sorting the array for correct order
		
		MaxThread m = new MaxThread(max);
		MinThread m1 = new MinThread(max);
		
		m.start();
		m1.start();
		
		try {
			m.join();
			m1.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
