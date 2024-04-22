package lab6.Task2;

public abstract class Person implements NameData {

    protected String firstName;
    protected String lastName;

    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String[] getFullName() {
        return new String[]{getFirstName(), getLastName()};
    }

    @Override
    public void printFullName() {
        String[] name = getFullName();
        StringBuilder res = new StringBuilder();
        for (String s : name) {
            res.append(s).append(" ");
        }
        System.out.println(res.toString().trim());
    }

}
