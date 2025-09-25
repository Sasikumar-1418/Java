package Thread;

class Threads extends Thread{
	@Override
	public void run() {
		System.out.println("Printing My name : "+getName());
	}
}
public class SimpleThreadWithExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads t = new Threads();
		System.out.println("Created the Simple Thread with Extends Keyword: ");
		t.setName("Sasikumar");
		t.start();
	}

}
