package lab4;

public class Main {
    public static void main(String[] args) {
        Arrays1 a = new Arrays1();
        Arrays2 aa = new Arrays2();
        //PART 1 - TASK 1
        a.printUneven();
        //PART 1 - TASK 2
        a.printDivisible();
        //PART 1 - TASK 3
        a.printIsCorrectSum();
        //PART 1 - TASK 4
        a.printIsGreater();
        //PART 1 - TASK 5
        int[] arr = {1, -3, 7, 100, 5, 4, 2};
        System.out.println(a.printIsThreeIn(arr));
        //PART 1 - TASK 6
        System.out.println(a.isThreeOrOneIn(arr));

        //PART 2 - TASK 1
        int[] arr2 = {10, 200, 3000};
        aa.isSortedAsc(arr2);
        //PART 2 - TASK 2
        aa.createArray();
        //PART 2 - TASK 3
        aa.swapArray(arr2);
        //PART 2 - TASK 4
        int[] arr3 = {1, 2, 3, 1, 2, 3, 4, 1, 2, 3};
        aa.findFirstUnique(arr3);
    }
}
