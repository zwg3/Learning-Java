package lab9.Task3;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Listing {

    public static void addMillList(ArrayList<Integer> l) {
        for (int i = 0; i <= 1000000; i++) {
            l.add(i);
        }
    }

    public static void addMillLinkedList(LinkedList<Integer> l) {
        for (int i = 0; i <= 1000000; i++) {
            l.add(i);
        }
    }

    public static void getFromList(ArrayList<Integer> l) {
        Random r = new Random();
        for (int i = 0; i <= 100000; i++) {
            l.get(r.nextInt(1000000));
        }
    }

    public static void getFromLinkedList(LinkedList<Integer> l) {
        Random r = new Random();
        for (int i = 0; i <= 100000; i++) {
            l.get(r.nextInt(1000000));
        }
    }
}
