package com.company;

public class Man {
    public Man(String name){
        manname = name;
    }
    String manname;
    int age;
    boolean marriage;
    int children;

    public void setAge(int age){
        this.age = age;
    }
    public void setMarriage(boolean marriage){
        this.marriage = marriage;
    }
    public void setChildren(int children){
        this.children = children;
    }
    public void printInfo(){
        System.out.println(this.age);
        System.out.println(this.children);
        System.out.println(this.marriage);
        System.out.println(this.manname);
    }


}
