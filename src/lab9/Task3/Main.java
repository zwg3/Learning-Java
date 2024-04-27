package lab9.Task3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        Listing.addMillList(l);
        Listing.addMillLinkedList(ll);

        // длится около 181ms ввиду временной сложности O(1) для операции get() с коллекцией ArrayList
        Listing.getFromList(l);

        // длится около 145878ms ввиду временной сложности O(n) операции get() с коллекцией LinkedList
        Listing.getFromLinkedList(ll);
    }
}
