package com.mycompany.csc325_oop_designreview_lab;

public class Student extends Human {
    private double gpa;

    public Student(String name, short age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge() + ", GPA: " + gpa;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {

    }
}
