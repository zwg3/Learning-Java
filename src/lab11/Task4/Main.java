package lab11.Task4;

public class Main {
    private static final Object lock = new Object();
    private static boolean threadTurn = true;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    try {
                        while (!threadTurn) {
                            lock.wait();
                        }
                        System.out.println(Thread.currentThread().getName());
                        threadTurn = false;
                        lock.notify();
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    try {
                        while (threadTurn) {
                            lock.wait();
                        }
                        System.out.println(Thread.currentThread().getName());
                        threadTurn = true;
                        lock.notify();
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
