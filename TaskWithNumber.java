package task.index;

import java.util.Scanner;


public class TaskWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int a = sc.nextInt();
		
		if(a>0) {
			System.out.println("Enter Number is Positive: "+a);
		}
		else if(a<0) {
			System.out.println("Enter Number is Negative: "+a);
		}
		else {
		System.out.println("Enter Number is zero: "+a);
		}
		sc.close();
	}

}
