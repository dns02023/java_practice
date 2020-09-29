package com.company.inheritance;

public class WebDeveloper extends Developer{

    private int salary;
    private String job;

    public WebDeveloper(String name, int age){
        super(name, age);
        this.setSpecialty("Web Development");
    }

    @Override
    public void showInfo(){
        System.out.println("Web Developer: " + this.getName() + this.getAge() + this.getSpecialty() + this.job);
    }


    public void getJob(Company company){
        company.recruit(this);
        this.job = company.getName();
    }
}
