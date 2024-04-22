package lab6.Task1;

public abstract class Person {
    protected String firstName;
    protected String lastName;

    protected String getFirstName(){
        return firstName;
    }

    protected String getLastName(){
        return lastName;
    }

    protected Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    abstract void printData();

}
