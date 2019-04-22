package com.yura;

import java.util.Arrays;
import java.util.Comparator;

public class Group implements Voenkom {

    private Student[] st = new Student[10];

    public Group() {
        super();
    }

    public void addStudent(Student student) throws MyExeption {

        if (student == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < st.length; i++) {
            if (st[i] == null) {
                st[i] = student;
                return;
            }
        }
        throw new MyExeption();
    }

    public boolean deleteStudent(long cardNumber) {

        for (int i = 0; i < st.length; i++) {
            if (st[i] != null && st[i].getStudentCard() == cardNumber) {
                st[i] = null;
                return true;
            }
        }
        return false;
    }

    public Student searchStudent(String lastName) {

        for (Student student : st) {
            if (student != null && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }


    public int compare(Student st1, Student st2) {
        if (st1 != null && st2 == null) {
            return 1;
        }
        if (st1 == null && st2 != null) {
            return -1;
        }
        if (st1 == null && st2 == null) {
            return 0;
        }
        return st1.getLastName().compareTo(st2.getLastName());
    }

    @Override
    public String toString() {
        return "Group{" +
                "st=" + Arrays.toString(st) +
                '}';
    }


    @Override
    public Student[] getVoencom() {
        int n = 0;
        for (Student student : st) {
            if (student != null && student.getAge() >= 18) {
                n += 1;
            }
        }
        Student[] voencomArray = new Student[n];
        int i = 0;
        for (Student student : this.st) {
            if (student != null && student.getAge() >= 18) {
                voencomArray[i++] = student;
            }
        }
        return voencomArray;
    }
}


