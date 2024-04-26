package lab9.Task2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Unique {

    public static Set<Integer> turnUnique(ArrayList<Integer> c) {
        Set<Integer> integers = new HashSet<Integer>(c);
        return integers;
    }
}
