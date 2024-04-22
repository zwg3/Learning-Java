package lab6.Task2;

public class Main {
    public static void main(String[] args) {
        Client c = new Client("John", "Doe", "First National");
        c.printFullName();
        c.printData();

        System.out.println();

        Employee e = new Employee("Ann", "Smith", "First National");
        e.printFullName();
        e.printData();
    }
}
