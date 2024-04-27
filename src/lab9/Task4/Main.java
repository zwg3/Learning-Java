package lab9.Task4;

import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        User u1 = new User("Nick");
        User u2 = new User("Dan");

        Random random = new Random();

        Map<User, Integer> scores = new HashMap<>();

        scores.put(u1, random.nextInt(100));
        scores.put(u2, random.nextInt(100));

        System.out.println(scores);

        Printer.prompt(scores);


    }
}
