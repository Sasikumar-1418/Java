package Thread;

class ThreadDelay extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500*5);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadWithDelay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDelay t = new ThreadDelay();
		
		t.start();
	}

}
