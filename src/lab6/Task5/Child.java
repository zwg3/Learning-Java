package lab6.Task5;

import java.io.IOException;

public class Child extends Parent {

    protected String name;

    @Override
    public void askInfo() throws IOException {
        super.askInfo();
        System.out.print("Введите имя поользователя ");
        name = r.readLine();
    }
}
