package com.pramod.compratorComprable;

public class Employee implements Comparable {

    int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {

        Employee e = (Employee) o;

        if (this.getAge() == e.getAge()) {
            return 0;
        } else if (this.getAge() > e.getAge()) {
            return -1;
        } else {
            return 1;
        }

    }

}
