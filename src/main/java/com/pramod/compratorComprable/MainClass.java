package com.pramod.compratorComprable;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Pramod", 25);
        Employee e2 = new Employee(3, "keshav", 30);
        Employee e3 = new Employee(2, "riya", 30);
        Employee e4 = new Employee(4, "ramesh", 22);

        Employee e5 = new Employee(5, "shubham", 32);

        List<Employee> employeeList = Arrays.asList(e1, e2, e3, e4, e5);

        // Collections.sort(employeeList);

        // print(employeeList);
        // System.out.println("sorted employeelist" + employeeList);

        

        Collections.sort(employeeList, (Employee o1, Employee o2) -> {

            if (o1.getAge() == o2.getAge()) {
                return 0;
            } else if (o1.getAge() > o2.getAge()) {
                return 1;
            } else {
                return -1;
            }

        });

        for (Employee e : employeeList) {
            System.out.println(e.getAge());
        }

    }

}
