package com.pramod.java8StreamApi.ClassLevelStreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployeeByDeptWise {


    public static void main(String[] args) {
        // counting the employee by department wise,
        // like how many employee are present in each department

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

        // we will use groupingBy method of Collectors class
        Map<String, Long> EmployeeByDept = employeeList.stream().collect(Collectors.
                groupingBy(elem -> elem.getDepartment(), Collectors.counting()));


        // so basically first argument is getDepartment will fetch departemtn of the employee
        // and 2nd argument, we are counting ,what is the number, how many times it is coming

        System.out.println(EmployeeByDept);

    }
}
