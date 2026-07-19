package com.pramod.java8StreamApi.ClassLevelStreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeBySalaryAndName {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("Pramod", "IT", 65000),
                new Employee("Amit", "HR", 55000),
                new Employee("Rahul", "Finance", 72000),
                new Employee("Neha", "IT", 80000),
                new Employee("Sneha", "Marketing", 80000),
                new Employee("Vikas", "IT", 75000),
                new Employee("Anjali", "HR", 58000),
                new Employee("Rohit", "Finance", 90000),
                new Employee("Pooja", "Marketing", 67000),
                new Employee("Karan", "IT", 85000)

        );


        // sort the employee by salary first and if two temployee have same name sort them by name(String)

// sorted(Comprartor.reverseOrder() will not work here, as we have complex object, so we neet to give custom logic


        List<Employee> employeeListBySalaryAndName = employeeList.stream()
                .sorted((emp1, emp2) -> {
                    if (emp1.getSalary() > emp2.getSalary()) {
                        return -1;
                    } else if (emp1.getSalary() < emp2.getSalary()) {
                        return 1;
                    } else {
                        return -1 * emp1.getName().compareTo(emp2.getName());
                    }
                })
                .collect(Collectors.toList());


        for (Employee emp : employeeListBySalaryAndName) {
            System.out.println(emp.getName() +" : "+ emp.getSalary());
        }

    }
}
