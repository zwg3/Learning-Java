package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {

    public void isSortedAsc(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                System.out.println("Please, try again");
                return;
            }
        }
        System.out.println("OK");
    }

    public void createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < len; i++) {
            int j = scanner.nextInt();
            arr[i] = j;
        }
        System.out.println("Result: " + Arrays.toString(arr));
    }

    public void swapArray(int[] arr) {
        System.out.println("Before: " + Arrays.toString(arr));
        int arrStart = arr[0];
        int arrEnd = arr[arr.length - 1];
        arr[0] = arrEnd;
        arr[arr.length - 1] = arrStart;
        System.out.println("After: " + Arrays.toString(arr));
    }

    public void findFirstUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && a == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(a);
                break;
            }
        }
    }
}
