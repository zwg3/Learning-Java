package lab11.Task2;

import java.util.Random;

public class PrintStreamState extends Thread {

    public static void runStreams() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            PrintStreamState t = new PrintStreamState();
            System.out.println(t.getState());
            t.start();
            System.out.println(t.getState());
            sleep(1);
            System.out.println(t.getState());
            System.out.println("======");
        }
    }
}
