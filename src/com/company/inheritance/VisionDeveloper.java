package com.company.inheritance;

public class VisionDeveloper extends Developer{

    private int salary;

    public VisionDeveloper(String name, int age){
        super(name, age);
        this.specialty = "Computer Vision";
    }

    @Override
    public void showInfo(){
        System.out.println("Vision Developer: " + this.getName() + this.getAge() + this.getSpecialty() + this.job.name);
    }

    @Override
    public void introduceMy() {
        System.out.println("I'm good at " + this.specialty);
    }
}
