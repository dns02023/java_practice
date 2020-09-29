package com.company.inheritance;

public class VisionDeveloper extends Developer{

    private int salary;
    private String job;

    public VisionDeveloper(String name, int age){
        super(name, age);
        this.setSpecialty("Computer Vision");
    }

    @Override
    public void showInfo(){
        System.out.println("Vision Developer: " + this.getName() + this.getAge() + this.getSpecialty());
    }


}
