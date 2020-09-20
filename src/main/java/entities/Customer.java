package entities;

import java.util.Date;


public class Customer {

    private String firstName;
    private String lastName;
    private Integer age;
    private Date registrationDate;

    public Customer(){

    }

    public Customer( String firstName, String lastName, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.registrationDate = new Date();
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate){
        this.registrationDate = registrationDate;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
