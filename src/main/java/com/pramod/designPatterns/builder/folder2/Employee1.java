package com.pramod.designPatterns.builder.folder2;

public class Employee1 {

    private String name;
    private int age;
    private String department;
    private double salary;
    private String address;

    private Employee1(EmployeeBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.department = builder.department;
        this.salary = builder.salary;
        this.address = builder.address;

    }

    @Override
    public String toString() {
        return "Employee1{" + "name = " + name + " age =" + age + " department = " + department + "salary = " + salary
                + " address = " + address;
    }

    // Employeebuilder class
    public static class EmployeeBuilder {
        private String name;
        private int age;
        private String department;
        private double salary;
        private String address;

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

        public Employee1 build() {
            return new Employee1(this);
        }

    }

}
