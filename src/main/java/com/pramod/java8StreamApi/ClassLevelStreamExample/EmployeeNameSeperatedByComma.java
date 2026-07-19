package com.pramod.java8StreamApi.ClassLevelStreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeNameSeperatedByComma {

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


        //list the employee name as string , name should be comma seperated

        // we will use Collectors.joining(",")

        String namesOfEmployee = employeeList.stream()
                .map(emp -> emp.getName())
                .collect(Collectors.joining(", "));


        System.out.println(namesOfEmployee);




    }
}
