package lab9.Task2;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            l.add(i);
        }
        System.out.println(Unique.turnUnique(l));
    }
}
