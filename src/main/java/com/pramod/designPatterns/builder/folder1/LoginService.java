package com.pramod.designPatterns.builder.folder1;

public class LoginService {

    public void registerdUser() {

        EmployeeBuilder builder = new EmployeeBuilder();
        builder.setName("Pramod")
                .setAddress("Ranchi");


        Employee emp = new Employee(builder);
        System.out.println("welcome message sent to: " + emp);


    }
}
