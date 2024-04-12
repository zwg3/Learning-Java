package lab1;
import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
//TASK 1
        System.out.print("Я\n");
        System.out.print("хорошо\n");
        System.out.print("знаю\n");
        System.out.print("Java.\n");
//TASK 2
        System.out.println((46 + 10) * (10 / 3d));
        System.out.println((29) * (4) * (-15));
//TASK 3
        int number = 10500;
        int result = (number / 10) / 10;
        System.out.println(result);
//TASK 4
        double res = 3.6 * 4.1 * 5.9;
        System.out.println(res);
//TASK 5
        Scanner s = new Scanner(System.in);
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        int s3 = s.nextInt();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
//TASK 6
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
    }
}
