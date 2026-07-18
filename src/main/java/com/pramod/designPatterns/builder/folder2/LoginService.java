package com.pramod.designPatterns.builder.folder2;

import com.pramod.designPatterns.builder.folder1.Employee;
import com.pramod.designPatterns.builder.folder1.EmployeeBuilder;

import java.sql.SQLOutput;

public class LoginService {

    void sendWelcomeMessage(String name, String address) {
        Employee emp = new Employee(
                new EmployeeBuilder()
                        .setName(name)
                        .setAddress(address)
        );

        System.out.println("welcome message sent to : " + emp);
    }


}
