package lab7;

public class Main {
    public static void main(String[] args) {
        Plane.Wing pw = new Plane.Wing();
        Plane.Wing pw2 = new Plane.Wing();
        pw.setWeight(88);
        pw.printWeight();
        pw2.setWeight(10);
        pw2.printWeight();
    }
}