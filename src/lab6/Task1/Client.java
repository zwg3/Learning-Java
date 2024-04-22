package lab6.Task1;

public class Client extends Person {

    protected String bankName;

    protected Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    void printData() {
        System.out.println("Client first name: " + getFirstName() + "\n"
                + "Client last name: " + getLastName() + "\n"
                + "Bank name: " + bankName);
    }
}
