package lab3;

public class Tree {
    private String Name;
    private Integer Age;
    private Boolean IsAlive;

    public Tree(String name, Integer age, Boolean isAlive) {
        this.Name = name;
        this.Age = age;
        this.IsAlive = isAlive;
    }

    public Tree(String name, Integer age) {
        this.Name = name;
        this.Age = age;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public void printRes() {
        System.out.println("Name: " + this.Name + ", " +
                "Age: " + this.Age + ", " +
                "Is alive: " + this.IsAlive);
    }

}
