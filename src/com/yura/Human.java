package com.yura;

public class Human {
    private String name;
    private String lastName;
    private String complextion;
    private int age;


    public Human(String name, String lastName, String complextion, int age) {
        this.name = name;
        this.lastName = lastName;
        this.complextion = complextion;
        this.age = age;

    }

    public Human() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getComplextion() {
        return complextion;
    }

    public void setComplextion(String complextion) {
        this.complextion = complextion;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", complextion='" + complextion + '\'' +
                ", age=" + age +
                '}';
    }
}
