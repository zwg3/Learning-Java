package lab11.Task4;

public class ThreadCaller extends Thread {

    public static void nameCall() {

        ThreadCaller t1 = new ThreadCaller();
        ThreadCaller t2 = new ThreadCaller();
        while (true) {
            t1.run();
            System.out.println(t1.getName());
            t2.run();
            System.out.println(t2.getName());
        }
    }
}


















