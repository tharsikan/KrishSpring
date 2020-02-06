package com.example.myweb.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String name;
    private int age;

    public String getNametharis() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
