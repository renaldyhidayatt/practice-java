package concurrency.concurrency8;

class Counter {
    private int counter = 0;

    public synchronized int getCounter() {
        return counter;
    }

    public synchronized void increment() {
        System.out.println("counter value before increment=" + counter);
        counter++;
        System.out.println("counter value after increment=" + counter);
    }

    public synchronized void decrement() {
        System.out.println("counter value before decrement=" + counter);
        counter--;
        System.out.println("counter value after decrement=" + counter);
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread counterThreadA = new Thread() {
            @Override
            public void run() {
                counter.increment();
            }
        };

        Thread counterThreadB = new Thread() {
            @Override
            public void run() {
                counter.decrement();
            }
        };

        counterThreadA.start();
        counterThreadB.start();
        counterThreadA.join();
        counterThreadB.join();
        System.out.println("Counter = " + counter.getCounter());

    }
}
