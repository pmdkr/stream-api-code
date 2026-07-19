package com.pramod.java8StreamApi.ClassLevelStreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgSalaryOfByEachDept {

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

        // find the avg salary of employees in each department

        Map<String, Double> avgSalary = employeeList.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.getDepartment(), Collectors.averagingInt(emp -> emp.getSalary())));


        System.out.println(avgSalary);




    }
}
