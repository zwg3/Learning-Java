package lab3;

public class Car {
    private String Color;
    private String Name;
    private Double Weight;

    public Car(String color) {
        this.Color = color;
    }

    public Car(String color, Double weight) {
        this.Color = color;
        this.Weight = weight;
    }

    public Car() {
    }

    public void printRes() {
        System.out.println("Name: " + this.Name + ", " +
                "Color: " + this.Color + ", " +
                "Weight: " + this.Weight);
    }
}
