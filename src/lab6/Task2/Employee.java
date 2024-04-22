package lab6.Task2;

public class Employee extends Person {

    protected String bankName;

    protected Employee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void printData() {
        System.out.println("Employee first name: " + getFirstName() + "\n"
                + "Employee last name: " + getLastName() + "\n"
                + "Bank name: " + bankName);
    }

}
