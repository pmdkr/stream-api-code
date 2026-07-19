package com.pramod.java8StreamApi.ClassLevelStreamExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTopTwoHighestSalaryEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee("Pramod", "IT", 65000);
        Employee e2 = new Employee("Amit", "HR", 55000);
        Employee e3 = new Employee("Rahul", "Finance", 72000);
        Employee e4 = new Employee("Neha", "IT", 80000);
        Employee e5 = new Employee("Sneha", "Marketing", 60000);
        Employee e6 = new Employee("Vikas", "IT", 75000);
        Employee e7 = new Employee("Anjali", "HR", 58000);
        Employee e8 = new Employee("Rohit", "Finance", 90000);
        Employee e9 = new Employee("Pooja", "Marketing", 67000);
        Employee e10 = new Employee("Karan", "IT", 85000);

        List<Employee> employeeList = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);


        // find top two 2 employee whose salary is highest

        List<Employee> topTwoHighestSalaryEmp = employeeList.stream()
                .sorted(Comparator.comparingInt(emp -> -1 * emp.getSalary()))
                .limit(2)
                .collect(Collectors.toList());


        System.out.println(topTwoHighestSalaryEmp);


    }
}
