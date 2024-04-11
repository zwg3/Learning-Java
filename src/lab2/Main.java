package lab2;

public class Main {
    public static void main(String[] args) {
        //TASK 1 showcase
        Calculator calc = new Calculator();
        calc.divide(10, 3);
        calc.add(10L, 2L);
        calc.subtract(10, 2);
        calc.multiply(10, 2);
        //TASK 2 showcase
        Student s = new Student("Nick", 12, 4, 4, 5);
        System.out.println(s);
        Student ss = new Student("Ivan", 15);
        System.out.println(ss);
        Student sss = new Student();
        System.out.println(sss);
    }
}
