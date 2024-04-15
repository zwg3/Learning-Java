package lab4;

import java.util.Scanner;

public class Arrays1 {

    public void printUneven() {
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void printDivisible() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Число " + i + " делится на 3 и 5");
            } else if (i % 3 == 0) {
                System.out.println("Число " + i + " делится на 3");
            } else if (i % 5 == 0) {
                System.out.println("Число " + i + " делится на 5");
            }
        }
    }

    public void printIsCorrectSum() {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = s.nextInt();
        System.out.print("Введите второе число: ");
        int b = s.nextInt();
        System.out.print("Введите третье число: ");
        int c = s.nextInt();
        if (a + b == c) {
            System.out.println("Результат: " + true);
        } else {

            System.out.println("Результат: " + false);
        }
    }

    public void printIsGreater() {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = s.nextInt();
        System.out.print("Введите второе число: ");
        int b = s.nextInt();
        System.out.print("Введите третье число: ");
        int c = s.nextInt();
        if (b > a && c > b) {
            System.out.println("Результат: " + true);
        } else {
            System.out.println("Результат: " + false);
        }
    }

    public void printIsThreeIn(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        if (arr[0] == 3 || arr[arr.length - 1] == 3) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    public void isThreeOrOneIn(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3 || arr[i] == 1) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}


