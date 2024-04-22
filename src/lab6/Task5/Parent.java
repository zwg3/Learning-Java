package lab6.Task5;

import java.util.Scanner;

public class Parent {

    public Integer age;
    public Scanner s = new Scanner(System.in);

    public void askInfo() {
        System.out.print("Введите возраст пользователя ");
        age = s.nextInt();
    }

}
