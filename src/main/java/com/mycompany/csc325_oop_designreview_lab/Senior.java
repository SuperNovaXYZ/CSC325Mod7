package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    private int credits;

    public Senior(String name, short age, double gpa, int credits) {
        super(name, age, gpa);
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Senior - Name: " + getName() + ", Age: " + getAge() + ", GPA: " + getGPA() + ", Credits: " + credits;
    }
}
