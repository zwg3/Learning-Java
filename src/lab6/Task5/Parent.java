package lab6.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Parent {

    protected Integer age;
    protected BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public void askInfo() throws IOException {
        System.out.print("Введите возраст пользователя ");
        age = Integer.parseInt(r.readLine());
    }

}
