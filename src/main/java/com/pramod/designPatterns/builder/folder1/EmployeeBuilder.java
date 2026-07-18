package com.pramod.designPatterns.builder.folder1;

public class EmployeeBuilder {

    // step-1 declare field as Employee class
    String name;
    int age;
    String department;
    double salary;
    String address;


    // create setter method and return this;


    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
}
