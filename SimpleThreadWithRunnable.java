package Thread;

class RunThread implements Runnable{
	public void run() {
		System.out.println("Printing My name : "+Thread.currentThread().getName());
	}
}

public class SimpleThreadWithRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new RunThread(),"Sasikumar");  //Creating the Object for Runnable Thread
		System.out.println("Created the simple thread with Runnable");
		t.start();
	}

}
