package Thread;

class Even extends Thread{
	int sum=0;
	public void run() {
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("Printing the sum of even numbers is : "+ sum);
	}
}

class Odd extends Thread{
	public void run() {
		int sum=0;
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println("Printing the sum of odd numbers: "+sum);
	}
}

public class ThreadWithOddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odd o = new Odd();
		Even e = new Even();
		
		o.start();
		try{
			o.join();
		}
		catch(InterruptedException e1){
			System.out.println(e1);
		}
		
		e.start();
		
		try{
			e.join();
		}
		catch(InterruptedException e2){
			System.out.println(e2);
		}
	}

}
