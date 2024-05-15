package lab11.Task3;

public class runCounter extends Thread {

    static Counter c = new Counter();

    public static void inc() {
        c.increment();
    }

    public static void startCounter() {

        if (c.getCount() >= 100000){
            return;
        }

        for (int i = 0; i < 100; i++) {
            runCounter t = new runCounter();
            t.start();
            for (int j = 0; j < 1000; j++) {
                inc();
            }
        }
    }

    public static void printCounter() {
        System.out.println(c.getCount());
    }
}
