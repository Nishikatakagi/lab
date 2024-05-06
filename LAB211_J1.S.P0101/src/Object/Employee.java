/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Manager.Validation;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String phoneString;
    private String Email;
    private String address;
    private String sexString;
    private double salary;
    private String agency;

    public Employee() {
    }

    public Employee(String id, String firstName, String lastName, String phoneString, String Email, String address, String sexString, double salary, String agency) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneString = phoneString;
        this.Email = Email;
        this.address = address;
        this.sexString = sexString;
        this.salary = salary;
        this.agency = agency;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneString() {
        return phoneString;
    }

    public String getEmail() {
        return Email;
    }

    public String getAddress() {
        return address;
    }

    public String getSexString() {
        return sexString;
    }

    public double getSalary() {
        return salary;
    }

    public String getAgency() {
        return agency;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneString(String phoneString) {
        this.phoneString = phoneString;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSexString(String sexString) {
        this.sexString = sexString;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneString=" + phoneString + ", Email=" + Email + ", address=" + address + ", sexString=" + sexString + ", salary=" + salary + ", agency=" + agency + '}';
    }
    
    public void input(ArrayList<Employee> list){
        setId(Validation.getID("Enter the ID:", list));
        setFirstName(Validation.getString("Enter the First Name: "));
        setLastName(Validation.getString("Enter the Last Name: "));
        setPhoneString(Validation.getString("Enter phone: "));
        setEmail(Validation.getString("Enter email: "));
        setAddress(Validation.getString("Enter address: "));
        setSexString("Enter sex: ");
        setSalary(Validation.getDouble("Enter salary: ", "Number invalid", 0, Double.MAX_VALUE));
        setAgency(Validation.getString("Enter agency: "));
    }
    
    public void inputUpdate(String ID){
        setId(ID);
        setFirstName(Validation.getString("Enter the First Name: "));
        setLastName(Validation.getString("Enter the Last Name: "));
        setPhoneString(Validation.getString("Enter phone:"));
        setEmail(Validation.getString("Enter email:"));
        setAddress(Validation.getString("Enter address:"));
        setSexString("Enter sex: ");
        setSalary(Validation.getDouble("Enter salary: ", "Number invalid", 0, Double.MAX_VALUE));
        setAgency(Validation.getString("Enter agency: "));
    }
}
