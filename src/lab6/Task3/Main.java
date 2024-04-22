package lab6.Task3;

public class Main {
    public static void main(String[] args) {
        Truck t = new Truck(100, "Hyundai", 'Б', 90, 4, 200);
        t.outPut();
        t.newWheels(8);
        System.out.println(t);
    }
}
