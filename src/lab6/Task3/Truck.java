package lab6.Task3;

public class Truck extends Car {
    protected Integer wheelAmount;
    protected Integer maxWeight;

    protected Truck(int w, String m, char c, float s, Integer wheelAmount, Integer maxWeight) {
        super(w, m, c, s);
        this.wheelAmount = wheelAmount;
        this.maxWeight = maxWeight;
    }

    protected void newWheels(Integer amount) {
        this.wheelAmount = amount;
        System.out.println("Количество колёс: " + wheelAmount);
    }

    @Override
    public String toString() {
        return "wheelAmount = " + wheelAmount +
                ", maxWeight = " + maxWeight;
    }

}
