package Home_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        CounterThread thread1 = new CounterThread(counter);
        CounterThread thread2 = new CounterThread(counter);
        CounterThread thread3 = new CounterThread(counter);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
