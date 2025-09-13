package task.index;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counteven = 0;
		int countodd = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				counteven+=i;
			System.out.println("Given Numbers are even: "+i);
			}
			else {
				countodd+=i;
				System.out.println("Given numbers are Odd: "+i);
			}
		}
		System.out.println("Count of even: "+counteven);
		System.out.println("Count of odd: "+countodd);
	}

}
