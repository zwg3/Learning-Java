package lab6.Task1;

public class Employee extends Person {

    private String bankName;

    public Employee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    void printData() {
        System.out.println("Employee first name: " + getFirstName() + "\n"
                + "Employee last name: " + getLastName() + "\n"
                + "Bank name: " + bankName);
    }
}
