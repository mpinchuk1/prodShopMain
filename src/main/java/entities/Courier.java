package entities;

public class Courier {

    private String lastName;
    private String supplierCompanyName;

    public Courier() {
    }

    public Courier( String lastName, String supplierCompanyName) {

        this.lastName = lastName;
        this.supplierCompanyName = supplierCompanyName;

    }

    public String getLastName() {
        return lastName;
    }

    public String getSupplierCompanyName() {
        return supplierCompanyName;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "lastName='" + lastName + '\'' +
                ", supplierCompanyName='" + supplierCompanyName + '\'' +
                '}';
    }
}
