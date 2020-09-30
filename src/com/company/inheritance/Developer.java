package com.company.inheritance;

public class Developer implements Staff{
    // 하위 클래스에서 접근하게 하려면 protected를 써야함
    protected String name;
    protected int age;
    protected String specialty;

    public Developer(){}

    public Developer(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void showInfo(){
        System.out.println(this.name + this.age);
    }



}
