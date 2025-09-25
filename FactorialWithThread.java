package Thread;

class FactorialThread extends Thread {
    private int number;
    private long result;

    FactorialThread(int number) {
        this.number = number;
    }

    public void run() {
        result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
            try {
                Thread.sleep(500); // simulate some delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public long getResult() {
        return result;
    }
}

public class FactorialWithThread {
    public static void main(String[] args) {
        int number = 5;

        FactorialThread factorialThread = new FactorialThread(number);
        factorialThread.start(); // start child thread

        // Main thread prints "Calculating factorial..." 3 times while child runs
        for (int i = 1; i <= 3; i++) {
            System.out.println("Calculating factorial...");
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        try {
            factorialThread.join(); // wait for factorial thread to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Factorial of " + number + " is " + factorialThread.getResult());
    }
}
