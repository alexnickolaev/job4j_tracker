package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alexander Nikolaev");
        student.setGroup("1");
        student.setEnrollment(new Date());

        System.out.println("Student " + student.getName() + " from the group number " + student.getGroup() + ". Date of enrollment" + student.getEnrollment());
    }
}