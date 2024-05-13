package lab11.Task1;

import java.util.Random;

public class PrintStream extends Thread {

    Random random = new Random();

    @Override
    public void run() {
        System.out.println(random.nextInt(100));
    }

    public static void runStreams() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new PrintStream().start();
        }

    }
}
