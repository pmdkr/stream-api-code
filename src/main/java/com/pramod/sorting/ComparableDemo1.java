package com.pramod.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo1 {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "david", 45000),
                new Employee(1, "Alex", 20000),
                new Employee(1, "Jhon", 30000));

        Collections.sort(employeeList);
        System.out.println(employeeList);

        Comparator<Employee> nameComprator = (e1, e2) -> e1.name.compareTo(e2.name);

        Collections.sort(employeeList, nameComprator);

    }

}
