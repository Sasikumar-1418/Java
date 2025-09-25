package Thread;

class ThreadLoop extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Printing the Values from thread: "+i); 
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println("Caught Interrupted Exception");
			}
		}
	}
}

public class ThreadWithLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadLoop n = new ThreadLoop();
		ThreadLoop n1 = new ThreadLoop();
		
		n.start();
		n.join();
		
		n1.start();
		n1.join();
		
	}

}
