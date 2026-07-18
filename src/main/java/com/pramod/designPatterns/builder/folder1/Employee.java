package com.pramod.designPatterns.builder.folder1;

public class Employee {

    String name;
    int age;
    String department;
    double salary;
    String address;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }

    // constructor
    public Employee(EmployeeBuilder employeeBuilder) {

        this.name = employeeBuilder.name;
        this.age = employeeBuilder.age;
        this.department = employeeBuilder.department;
        this.salary = employeeBuilder.salary;
        this.address = employeeBuilder.address;
    }

}
        /**
         * problems without builder desing pattern
         *
         * Hard to remember parameter
         * Difficult when there are many optional fields
         * Less readable
         * Constructor becomes very large
         *
         *
         * and if some client dont want tu use any class properties , we need to provite
         * null values to that create an object, and
         *
         * 2nd opiton is:
         *
         * to create a constuctor for that client
         *
         *
         */


