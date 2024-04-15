package lab3;

public class Main {
    public static void main(String[] args) {
        //TASK 1
        Study s = new Study("Изучение Java - это просто!");
        System.out.println(s.printCourse());
        //TASK 2
        Car c1 = new Car("white");
        Car c2 = new Car("red", 100d);
        c1.printRes();
        c2.printRes();
        //TASK 3
        House h1 = new House();
        House h2 = new House();
        h1.setValues("TrumpTower", 68, 1983);
        h2.setValues("SaintPaulCathedral", 5, 1840);
        h1.printRes();
        h1.printYearsDiff();
        h2.printRes();
        h2.printYearsDiff();
        //TASK 4
        Tree tEmpty = new Tree();
        Tree tNameAge = new Tree("Oak", 10);
        tNameAge.printRes();
        Tree tFull = new Tree("Birch", 5, Boolean.FALSE);
        tFull.printRes();
    }
}
