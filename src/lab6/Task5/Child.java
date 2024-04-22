package lab6.Task5;

public class Child extends Parent {

    public String name;

    @Override
    public void askInfo() {
        super.askInfo();
        s.nextLine();
        System.out.print("Введите имя поользователя ");
        name = s.nextLine();
    }

    public void printInfo(){
        System.out.println("Возраст пользователя: " + age);
        System.out.println("Имя пользователя: " + name);
    }

}
