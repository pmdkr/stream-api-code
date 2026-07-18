package com.pramod.sorting;

public class Employee implements Comparable<Employee> {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public int compareTo(Employee e) {
        return Double.compare(this.salary, e.salary);
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }

}
