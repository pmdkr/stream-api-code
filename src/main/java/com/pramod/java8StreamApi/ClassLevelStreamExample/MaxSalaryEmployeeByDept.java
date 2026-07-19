package com.pramod.java8StreamApi.ClassLevelStreamExample;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class MaxSalaryEmployeeByDept {

    public static void main(String[] args) {
        List<Employee2> employeeList = Arrays.asList(
                new Employee2("Abhishek", "IT", 50000),
                new Employee2("Ankit", "IT", 70000),
                new Employee2("Rahul", "HR", 40000),
                new Employee2("Tina", "HR", 45000),
                new Employee2("Esha", "Finance", 60000),
                new Employee2("Naman", "Finance", 55000),
                new Employee2("Sachit", "IT", 80000),
                new Employee2("Pushp", "Marketing", 50000),
                new Employee2("Sumit", "Marketing", 52000)
        );

        Map<String, Optional<Employee2>> result = employeeList.stream()
                .collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.maxBy(Comparator.comparingInt(emp -> emp.getSalary()))));

        System.out.println(result);
    }


}
