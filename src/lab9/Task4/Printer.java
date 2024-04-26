package lab9.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Printer {

    public static void prompt(Map<User, Integer> m) throws IOException {
        System.out.print("Введите имя пользователя ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userName = reader.readLine();
        for (User i : m.keySet()) {
            if (Objects.equals(i.getName(), userName)) {
                System.out.print("Количество очков пользователя " + i + ": " + m.get(i));
                return;
            }
        }
        System.out.println("Пользователь не найден");
    }

}
