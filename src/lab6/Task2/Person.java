package lab6.Task2;

public abstract class Person implements NameData {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String firstName, String lastName) {
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
