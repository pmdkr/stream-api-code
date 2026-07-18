package com.pramod.designPatterns.builder.folder1;

public class MigrateEmployee {

    void migrateEmp(String name, int age) {

        EmployeeBuilder employee = new EmployeeBuilder();

        employee.setName(name)
                .setAge(age);

        Employee migrateEmp = new Employee(employee);


        System.out.println("Migrated employee : " + migrateEmp);

    }
}
