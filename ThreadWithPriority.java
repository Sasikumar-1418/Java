package Thread;

class Alpha extends Thread {
    public void run() {
        for (int i = 1; i <= 1000000; i++) {
            // just looping (heavy work)
        }
        System.out.println("Finished: " + Thread.currentThread().getName());
    }
}

class Beta extends Thread {
    public void run() {
        for (int i = 1; i <= 1000000; i++) {
            // heavy loop
        }
        System.out.println("Finished: " + Thread.currentThread().getName());
    }
}

class Gamma extends Thread {
    public void run() {
        for (int i = 1; i <= 1000000; i++) {
            // heavy loop
        }
        System.out.println("Finished: " + Thread.currentThread().getName());
    }
}

public class ThreadWithPriority {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        Beta b = new Beta();
        Gamma g = new Gamma();

        a.setName("Alpha");
        b.setName("Beta");
        g.setName("Gamma");

        // Set priorities
        a.setPriority(Thread.MAX_PRIORITY);   // 10
        b.setPriority(Thread.MIN_PRIORITY);   // 1
        g.setPriority(Thread.NORM_PRIORITY);  // 5

        // Start threads
        b.start();
        a.start();
        g.start();
    }
}
