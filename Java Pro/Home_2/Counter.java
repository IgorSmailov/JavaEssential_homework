package Home_2;


public class Counter {
    private int counter;

    public synchronized void count() {

            for (int i = 0; i < 10; i++) {
                counter++;
                System.out.println("Thread = " + Thread.currentThread().getName());
                System.out.println(counter);
            }
        }
    }

