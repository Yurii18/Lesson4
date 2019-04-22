package com.yura;

public class Student extends Human {
    private int yearOfStudy;
    private long studentCard;

    Student(String name, String lastName, String complextion, int age, int yearOfStudy, long studentCard) {
        super(name, lastName, complextion, age);
        this.yearOfStudy = yearOfStudy;
        this.studentCard = studentCard;
    }

    Student() {
        super();
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public long getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(long studentCard) {
        this.studentCard = studentCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "yearOfStudy=" + yearOfStudy +
                ", studentCard=" + studentCard + '\'' +  super.toString() +
                '}';
    }
}
