package com.pramod.designPatterns.builder.folder1;

public class UseEmployee {

    public static void main(String[] args) {
        System.out.println("builder design pattern");


        LoginService loginEmployee = new LoginService();

        loginEmployee.registerdUser();


        MigrateEmployee migratedEmployee = new MigrateEmployee();
        migratedEmployee.migrateEmp("Keshav", 25);
    }
}
