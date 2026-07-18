package com.pramod.java8StreamApi.flatMap;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String city;
    int age;

    Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

}

public class DemoFlatMap3 {

    public static void main(String[] args) {

        // Employee e1 = new Employee("pramod", "Ranchi", 30);
        List<Employee> employeeList1 = Arrays.asList(
                new Employee("Ramesh", "gola", 32),
                new Employee("Shubham", "gola", 32),
                new Employee("Swasti", "gola", 32));

        List<Employee> employeeList2 = Arrays.asList(new Employee("Reenu", "gola", 32),
                new Employee("Keshav", "gola", 32),
                new Employee("Anurag", "gola", 32),
                new Employee("Pramod", "gola", 32));

        List<List<Employee>> employeeList = Arrays.asList(employeeList1, employeeList2);

        // print the name of employee

        // befor java 8 - enhanced for loop

        // for (List<Employee> emp : employeeList) {

        // for (Employee employee : emp) {
        // System.out.println(employee.name);
        // }
        // }

        // with stream
        List<String> name = employeeList.stream().flatMap(emp -> emp.stream()).map(item -> item.name)
                .collect(Collectors.toList());
        System.out.println(name);

    }

}
