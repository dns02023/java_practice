package com.company.inheritance;

public class Developer {
    private String name;
    private int age;
    private int salary;
    private String specialty;

    public Developer(){}

    public Developer(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
    public String getSpecialty(){
        return this.specialty;
    }

    public void showInfo(){
        System.out.println(this.name + this.age + this.specialty);
    }



}
