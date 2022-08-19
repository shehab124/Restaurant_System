package sample;

import java.util.ArrayList;
public class Person {
    private String name; // name of emp
    private String address; // address of emp
    private double salary; // salary of emp
    private String password;
    //variable in the class

    public Person()  // default constructor
    {
    }

    public Person(String name, String address, double salary, String password) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}

/*package sample;


public class Person
{
    private String name; // name of emp
    private String address; // address of emp
    private double salary; // salary of emp
    private String password;
    private boolean employeeType;


    public Person()  // default constructor
    {
    }

    public Person(String name, String address, double salary, String password,boolean employeeType) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.password = password;
        this.employeeType = employeeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public boolean isEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(boolean employeeType) {
        this.employeeType = employeeType;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}*/
