package entities;

public class Seller {

    private String firstName;
    private String lastName;

    public Seller() {
    }

    public Seller(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
